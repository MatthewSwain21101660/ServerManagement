package uk.ac.hope.mcse.segh.servermanagement.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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


        //return repository.findHardwareReadingByCpu(57);
        return repository.findAll();
        //return repository.findHardwareReadingById(1);

        //return hardwareType;
    }
}
