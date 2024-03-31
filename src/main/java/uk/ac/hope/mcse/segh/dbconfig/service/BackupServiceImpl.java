package uk.ac.hope.mcse.segh.dbconfig;

import org.springframework.stereotype.Service;

@Service
public class BackupServiceImpl implements BackupService {


    @Override
    public String backupFunction(String sourcePath, String destinationPath){

        return "Hello";
    }
}
