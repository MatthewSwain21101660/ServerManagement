package uk.ac.hope.mcse.segh.servermanagement.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.ac.hope.mcse.segh.servermanagement.service.BackupService;
import uk.ac.hope.mcse.segh.servermanagement.service.HardwareUtil;

@RestController
class ServerManagementController {



    private final HardwareUtil hardwareUtil;

    private final BackupService backupService;

    @Autowired
    ServerManagementController(HardwareUtil hardwareUtil, BackupService backupService) {
        this.hardwareUtil = hardwareUtil;
        this.backupService = backupService;
    }

    @GetMapping("/backupFunction")
    String backupFunction(@RequestParam(value = "sourcePath", defaultValue = "test") String sourcePath, String destinationPath){
        return backupService.backupFunction(sourcePath, destinationPath);
    }

    @GetMapping("/getUtil")
    String getUtil(@RequestParam(value= "hardwareType", defaultValue = "CPU") String hardwareType, String timePeriod){
        return hardwareUtil.getUtil(hardwareType, timePeriod);
    }

}


