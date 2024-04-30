package uk.ac.hope.mcse.segh.servermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.hope.mcse.segh.servermanagement.repo.HardwareReadingsRepository;

@Service
public class HardwareUtilImpl implements HardwareUtil {

    private HardwareReadingsRepository repository;

    @Autowired
    public HardwareUtilImpl(HardwareReadingsRepository repository){
        this.repository = repository;
    }

    @Override
    public String getUtil(String hardwareType, String timePeriod){

        repository.setReading1(hardwareType);
        return hardwareType;
    };
}
