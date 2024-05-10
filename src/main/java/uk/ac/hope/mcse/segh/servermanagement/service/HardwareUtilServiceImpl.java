package uk.ac.hope.mcse.segh.servermanagement.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import uk.ac.hope.mcse.segh.servermanagement.model.HardwareReading;
import uk.ac.hope.mcse.segh.servermanagement.repo.HardwareReadingRepository;

import java.util.List;

@Service
@Transactional
public class HardwareUtilServiceImpl implements HardwareUtilService {

    private final HardwareReadingRepository repository;

    @Autowired
    public HardwareUtilServiceImpl(HardwareReadingRepository repository){
        this.repository = repository;
    }

    @Override
    public List<HardwareReading> getUtil(String hardwareType, String timePeriod) {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        OperatingSystem os = si.getOperatingSystem();




        GlobalMemory latestRamReading = hal.getMemory();

        System.out.println(hal.getProcessor());
        System.out.println(hal.getMemory());
        System.out.println(hal.getComputerSystem());
        System.out.println(hal.getDisplays());
        System.out.println(hal.getDiskStores());
        System.out.println(hal.getGraphicsCards());
        System.out.println(hal.getLogicalVolumeGroups());
        System.out.println(hal.getNetworkIFs());
        System.out.println(hal.getNetworkIFs());
        System.out.println(hal.getDiskStores());
        System.out.println(hal.getPowerSources());
        System.out.println(hal.getSensors());
        System.out.println(hal.getSoundCards());
        System.out.println(hal.getUsbDevices(true));
        System.out.println(hal.getClass());

        //HardwareReading latestHardwareReading = new HardwareReading();
        //latestHardwareReading.setRam(latestRamReading);

        switch(hardwareType) {
            case "cpu":
                switch (timePeriod){
                    case "minute" :
                        //System.out.println(hal.getProcessor());
                        break;
                    case "hour" :

                    case "day" :

                    case "week":

                    case "month":
                }
                break;

            case "ram" :
                switch (timePeriod){
                    case "minute" :

                    case "hour" :

                    case "day" :

                    case "week":

                    case "month":
                }
                break;
        }






        //return (List<HardwareReading>) cpu;
        //return repository.findHardwareReadingByCpu(57);
        return repository.findAll();
        //return repository.findHardwareReadingById(1);

        //return hardwareType;
    }
}
