package com.progressoft.bamboo.libfolder;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static java.util.Objects.isNull;

public class BambooBuildJarsVerifier implements BambooVerifier<BuildJarsVerificationRequest> {


    @Override
    public void verify(BuildJarsVerificationRequest request) {
        verifyRequest(request);
        verifyJarFilesDirectoryPath(request);
        verifyEmptyJars(request);
    }

    private void verifyEmptyJars(BuildJarsVerificationRequest request) {
        File[] files = new File(request.jarFilesDirectoryPath).listFiles();


        if (!isNull(files)) {
            if (Arrays.stream(files).filter(file -> file.length() == 0).count() > 0) {
                throw new EmptyJarFileException("There is an empty jar file in your build lib path");
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
