package uk.ac.hope.mcse.segh.servermanagement.service;

import java.io.IOException;

public interface BackupService {

    void backupFunction(String sourcePath, String destinationPath) throws IOException;
}
