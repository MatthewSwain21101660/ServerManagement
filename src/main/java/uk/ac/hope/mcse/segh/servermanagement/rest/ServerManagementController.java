package uk.ac.hope.mcse.segh.servermanagement.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.hope.mcse.segh.servermanagement.model.HardwareReadings;
import uk.ac.hope.mcse.segh.servermanagement.repo.HardwareReadingsRepository;
import uk.ac.hope.mcse.segh.servermanagement.service.BackupService;
import uk.ac.hope.mcse.segh.servermanagement.service.HardwareUtilService;

import java.util.List;

@RestController
class ServerManagementController {

    private HardwareUtilService hardwareUtilService;

    private BackupService backupService;

    private HardwareReadingsRepository repository;

    //public ServerManagementController(){

    //}

    @Autowired
    public ServerManagementController(HardwareUtilService hardwareUtilService, BackupService backupService) {
        this.hardwareUtilService = hardwareUtilService;
        this.backupService = backupService;
    }

    @GetMapping("/backupFunction")
    String backupFunction(@RequestParam(value = "sourcePath", defaultValue = "test") String sourcePath, String destinationPath){
        return backupService.backupFunction(sourcePath, destinationPath);
    }

    @GetMapping("/getUtil")
    ResponseEntity<List<HardwareReadings>> getUtil(@RequestParam(value= "hardwareType", defaultValue = "CPU") String hardwareType, @RequestParam(value= "timePeriod", defaultValue = "Minute") String timePeriod){
        return ResponseEntity.ok().body(hardwareUtilService.getUtil(hardwareType, timePeriod));
    }

}


