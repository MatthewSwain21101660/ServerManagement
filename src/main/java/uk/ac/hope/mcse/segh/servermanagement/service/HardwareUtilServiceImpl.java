package uk.ac.hope.mcse.segh.servermanagement.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.hope.mcse.segh.servermanagement.model.HardwareReadings;
import uk.ac.hope.mcse.segh.servermanagement.repo.HardwareReadingsRepository;

import java.util.List;

@Service
@Transactional
public class HardwareUtilServiceImpl implements HardwareUtilService {

    private HardwareReadingsRepository repository;

    @Autowired
    public HardwareUtilServiceImpl(HardwareReadingsRepository repository){
        this.repository = repository;
    }

    @Override
    public List<HardwareReadings> getUtil(String hardwareType, String timePeriod) {




        return repository.findAll();

        //return hardwareType;
    }
}
