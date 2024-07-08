package uk.ac.hope.mcse.segh.servermanagement.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;

@Service
public class BackupServiceImpl implements BackupService {


    @Override
    public void backupFunction(String sourcePath, String destinationPath) throws IOException {
        Path sourcePathTemp = Path.of("C:\\Users\\meswa\\OneDrive\\Documents\\Uni_Temp\\Third_Year\\Software Engineering\\ServerManagement\\fileCopyTest\\Test.txt");
        Path destinationPathTemp= Path.of("C:\\Users\\meswa\\OneDrive\\Documents\\Uni_Temp\\Third_Year\\Software Engineering\\ServerManagement\\fileCopyTest\\Test2.txt");
        //File file = new File(sourcePathTemp);
        Files.copy(sourcePathTemp, destinationPathTemp, StandardCopyOption.REPLACE_EXISTING);


        /*List<File> files;
        String path = "C:/destination/";
        for(File file : files) {
            Files.copy(file.toPath(),
                    (new File(path + file.getName())).toPath(),
                    StandardCopyOption.REPLACE_EXISTING);
        }
        */

    }
}
