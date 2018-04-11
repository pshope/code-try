package com.progressoft.bamboo.libfolder;

import org.junit.Before;
import org.junit.Test;

public class BambooBuildJarsVerifierTest {

    private String validPath;
    private String invalidLibPath;
    private BambooBuildJarsVerifier buildJarsVerifier;

    @Before
    public void setUp() throws Exception {
        validPath = this.getClass().getClassLoader().getResource("WEB-INF/lib").getPath();
        invalidLibPath = this.getClass().getClassLoader().getResource("WEB-INF/invalid-lib").getPath();
        buildJarsVerifier = new BambooBuildJarsVerifier();
    }


    @Test(expected = BambooBuildJarsVerifier.NullRequestException.class)
    public void givenNullRequest_whenVerify_thenThrowException() {
        buildJarsVerifier.verify(null);
    }

    @Test(expected = BambooBuildJarsVerifier.InvalidJarFilesDirectoryPath.class)
    public void givenRequestWithInvalidJarFilesDirectoryPath_whenVerify_thenThrowException() {
        buildJarsVerifier.verify(new BuildJarsVerificationRequest("invalidPath"));
    }


    @Test(expected = BambooBuildJarsVerifier.EmptyJarFileException.class)
    public void givenJarFilesDirectoryHavingJarWithZeroSize_thenThrowException() {
        BuildJarsVerificationRequest request = new BuildJarsVerificationRequest(invalidLibPath);
        buildJarsVerifier.verify(request);
    }

    @Test
    public void givenValidDirectory_whenVerify_thenReturnResponseWithFailedResult() {
        buildJarsVerifier.verify(new BuildJarsVerificationRequest(validPath));
    }
}
