package uk.ac.hope.mcse.segh.dbconfig.service;

import org.springframework.stereotype.Service;

@Service
public class BackupServiceImpl implements BackupService {


    @Override
    public String backupFunction(String sourcePath, String destinationPath){

        return "Hello";
    }
}
