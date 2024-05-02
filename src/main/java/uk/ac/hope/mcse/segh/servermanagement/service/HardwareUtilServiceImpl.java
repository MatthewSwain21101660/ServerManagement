package uk.ac.hope.mcse.segh.servermanagement.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.hope.mcse.segh.servermanagement.model.HardwareReadings;
import uk.ac.hope.mcse.segh.servermanagement.repo.HardwareReadingsRepository;

@Service
@Transactional
public class HardwareUtilServiceImpl implements HardwareUtilService {

    private HardwareReadingsRepository repository;

    public HardwareUtilServiceImpl(){

    }

    @Autowired
    public HardwareUtilServiceImpl(HardwareReadingsRepository repository){
        this.repository = repository;
    }

    /*
    public int getUtil(String hardwareType, int timePeriod, HardwareReadings hardwarereadings){

        return hardwarereadings.getReading1();
    };
*/

    @Override
    public String getUtil(String hardwareType, String timePeriod, HardwareReadings hardwareReadings) {
        return null;
    }
}
