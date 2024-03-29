package uk.ac.hope.mcse.segh.dbconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
class ServerManagementController {

    private final BackupService backupService;

    @Autowired
    ServerManagementController(BackupService backupService) {
        this.backupService = backupService;
    }

    @GetMapping("/backupFunction")
    String backupFunction(@RequestParam(value = "sourcePath", defaultValue = "test") String sourcePath, String destinationPath){
        return backupService.backupFunction(sourcePath, destinationPath);
    }
}


