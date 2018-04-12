package com.progressoft.bamboo.libfolder;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.isNull;

public class BambooBuildJarsVerifier implements BambooVerifier<BuildJarsVerificationRequest> {


    @Override
    public void verify(BuildJarsVerificationRequest request) {
        verifyRequest(request);
        verifyJarFilesDirectoryPath(request);
        verifyEmptyJars(request);
    }

    private void verifyEmptyJars(BuildJarsVerificationRequest request) {
        List<File> files = new ArrayList<File>();
        allFiles(request.jarFilesDirectoryPath, files);
        System.out.println("Number of files to be verified: " + files.size());
        files.stream().filter(file -> file.length() == 0 && file.getName().contains(".jar"))
                .peek(d -> System.out.println("Found empty file: " + d.getAbsoluteFile().getName()))
                .forEach(File::delete);
    }

    private void allFiles(String directoryName, List<File> files) {
        File directory = new File(directoryName);

        File[] fList = directory.listFiles();
        assert fList != null;
        for (File file : fList) {
            if (file.isFile()) {
                files.add(file);
            } else if (file.isDirectory()) {
                allFiles(file.getAbsolutePath(), files);
            }
        }
    }


    private void verifyJarFilesDirectoryPath(BuildJarsVerificationRequest request) {
        if (Files.notExists(Paths.get(request.jarFilesDirectoryPath))) {
            throw new InvalidJarFilesDirectoryPath();
        }
    }

    private void verifyRequest(BuildJarsVerificationRequest request) {
        if (isNull(request)) {
            throw new NullRequestException();
        }
    }

    public static class NullRequestException extends RuntimeException {
    }

    public static class InvalidJarFilesDirectoryPath extends RuntimeException {

    }

    public static class EmptyJarFileException extends RuntimeException {
        public EmptyJarFileException(String message) {
            super(message);
        }
    }
}
