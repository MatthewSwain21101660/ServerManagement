package uk.ac.hope.mcse.segh.dbconfig.service;

public interface BackupService {

    String backupFunction(String sourcePath, String destinationPath);
}
