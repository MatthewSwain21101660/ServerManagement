package uk.ac.hope.mcse.segh.dbconfig;

public interface BackupService {

    String backupFunction(String sourcePath, String destinationPath);
}
