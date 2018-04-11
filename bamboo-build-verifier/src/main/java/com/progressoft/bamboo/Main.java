package com.progressoft.bamboo;

import com.progressoft.bamboo.libfolder.BambooBuildJarsVerifier;
import com.progressoft.bamboo.libfolder.BuildJarsVerificationRequest;

public class Main {

    public static void main(String[] args) {
        String directoryPath = args[0];
        BuildJarsVerificationRequest request = new BuildJarsVerificationRequest(directoryPath);
        try {
            new BambooBuildJarsVerifier().verify(request);
        } catch (Exception e) {
            System.out.println("BambooBuildJarsVerifier ERROR.");
            throw e;
        }

        System.out.println("BambooBuildJarsVerifier is OK.");
    }
}
