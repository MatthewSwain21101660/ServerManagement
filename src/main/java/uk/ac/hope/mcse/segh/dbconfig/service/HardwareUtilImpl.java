package uk.ac.hope.mcse.segh.dbconfig;

import org.springframework.stereotype.Service;

@Service
public class HardwareUtilImpl implements HardwareUtil {

    @Override
    public void hardwareType(String hardwareType){};

    @Override
    public void timePeriod(String timePeriod){};

    @Override
    public void recentData(String recentData){};

    @Override
    public void readingsFromLastTimePeriod(String readingsFromLastTimePeriod){};
}
