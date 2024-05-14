package uk.ac.hope.mcse.segh.servermanagement.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import uk.ac.hope.mcse.segh.servermanagement.model.HardwareReading;
import uk.ac.hope.mcse.segh.servermanagement.repo.HardwareReadingRepository;
import uk.ac.hope.mcse.segh.servermanagement.service.BackupService;
import uk.ac.hope.mcse.segh.servermanagement.service.ReturnHardwareReadingService;
import uk.ac.hope.mcse.segh.servermanagement.service.TakeHardwareReadingService;

import java.io.IOException;
import java.util.List;


@RestController
class ServerManagementController {

    private HardwareReadingRepository repository;
    private final BackupService backupService;
    private final TakeHardwareReadingService takeHardwareReadingService;
    private final ReturnHardwareReadingService returnHardwareReadingService;



    @Autowired
    public ServerManagementController(ReturnHardwareReadingService returnHardwareReadingService, BackupService backupService, TakeHardwareReadingService takeHardwareReadingService) {
        this.backupService = backupService;
        this.takeHardwareReadingService = takeHardwareReadingService;
        this.returnHardwareReadingService = returnHardwareReadingService;
    }


    @Scheduled(fixedRate = 1000)
    @Async
    void takeReading(){
        takeHardwareReadingService.takeReading();
    }

    @GetMapping("/backupFunction")
    void backupFunction(@RequestParam(value = "sourcePath", defaultValue = "test") String sourcePath, String destinationPath) throws IOException {
        backupService.backupFunction(sourcePath, destinationPath);
    }

    @GetMapping("/getUtil")
    ResponseEntity<List<HardwareReading>> returnReading(String hardwareType, @RequestParam(value= "timePeriod", defaultValue = "minute") String timePeriod){
        return ResponseEntity.ok().body(returnHardwareReadingService.returnReading(timePeriod));
    }

}


