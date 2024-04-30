package uk.ac.hope.mcse.segh.servermanagement.service;

import org.springframework.stereotype.Service;

@Service
public class BackupServiceImpl implements BackupService {


    @Override
    public String backupFunction(String sourcePath, String destinationPath){

        return destinationPath;
    }
}
