package uk.ac.hope.mcse.segh.servermanagement.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.GlobalMemory;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;
import oshi.util.Util;
import uk.ac.hope.mcse.segh.servermanagement.model.HardwareReading;
import uk.ac.hope.mcse.segh.servermanagement.repo.HardwareReadingRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
@Transactional
public class HardwareUtilServiceImpl implements HardwareUtilService {

    private final HardwareReadingRepository repository;

    @Autowired
    public HardwareUtilServiceImpl(HardwareReadingRepository repository){
        this.repository = repository;
    }

    @Override
    public String getUtil(String hardwareType, String timePeriod) {
        SystemInfo si = new SystemInfo();
        HardwareAbstractionLayer hal = si.getHardware();
        OperatingSystem os = si.getOperatingSystem();




        GlobalMemory latestRamReading = hal.getMemory();

        //System.out.println(FormatUtil.formatHertz(hal.getProcessor().getMaxFreq()));
        //System.out.println(hal.getMemory());

        List<String> oshi = new ArrayList<>();

        CentralProcessor processor = hal.getProcessor();

        long[] prevTicks = processor.getSystemCpuLoadTicks();
        // Wait a second...
        Util.sleep(1000);
        long[] ticks = processor.getSystemCpuLoadTicks();



        oshi.add(String.format(Locale.ROOT, "CPU load: %.1f%%",
                processor.getSystemCpuLoadBetweenTicks(prevTicks) * 100));

        System.out.println(String.format(Locale.ROOT, "CPU load: %.1f%%",processor.getSystemCpuLoad(1000) * 100));



    System.out.println(oshi);

        switch(hardwareType) {
            case "cpu":
                switch (timePeriod){
                    case "minute" :
                        return (String.format(Locale.ROOT, "CPU load: %.2f%%",processor.getSystemCpuLoad(1000) * 100));
                        //break;
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
        //return repository.findAll();
        //return repository.findHardwareReadingById(1);

        //return hardwareType;
        return "nothing";
    }
}
