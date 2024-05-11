package uk.ac.hope.mcse.segh.servermanagement.service;

import uk.ac.hope.mcse.segh.servermanagement.model.HardwareReading;

public interface HardwareUtilService {
    String getUtil(String hardwareType, String timePeriod);
}