package com.progressoft.bamboo.libfolder;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class BambooBuildJarsVerifierTest {

    private String validPath;
    private String invalidLibPath;
    private BambooBuildJarsVerifier buildJarsVerifier;
    private String withSubDirectoriesPath;

    @Before
    public void setUp() throws Exception {
        validPath = getPath("WEB-INF/lib");
        invalidLibPath = getPath("WEB-INF/invalid-lib");
        withSubDirectoriesPath = getPath("WEB-INF");
        buildJarsVerifier = new BambooBuildJarsVerifier();


    }

    private String getPath(String valid) {
        return this.getClass().getClassLoader().getResource(valid).getPath();
    }


    @Test(expected = BambooBuildJarsVerifier.NullRequestException.class)
    public void givenNullRequest_whenVerify_thenThrowException() {
        buildJarsVerifier.verify(null);
    }

    @Test(expected = BambooBuildJarsVerifier.InvalidJarFilesDirectoryPath.class)
    public void givenRequestWithInvalidJarFilesDirectoryPath_whenVerify_thenThrowException() {
        buildJarsVerifier.verify(new BuildJarsVerificationRequest("invalidPath"));
    }


    @Test
    public void givenRequestWithDirectoriesHavingEmptyJars_whenVerify_thenDeleteAllEmptyJars() {
        buildJarsVerifier.verify(new BuildJarsVerificationRequest(withSubDirectoriesPath));
        File directory = new File(invalidLibPath);
        assertTrue(directory.listFiles().length == 2);
    }

    @Test
    public void givenValidDirectory_whenVerify_thenDoNotThrowException() {
        buildJarsVerifier.verify(new BuildJarsVerificationRequest(validPath));
    }

    @Test
    public void givenMavenRepositoryPath_whenVerify_CheckProcessingTime() {
        buildJarsVerifier.verify(new BuildJarsVerificationRequest("/home/u483/.m2"));
    }
}
