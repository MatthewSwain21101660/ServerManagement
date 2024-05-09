package uk.ac.hope.mcse.segh.servermanagement.service;

import uk.ac.hope.mcse.segh.servermanagement.model.HardwareReadings;

import java.util.List;

public interface HardwareUtilService {
    List<HardwareReadings> getUtil(String hardwareType, String timePeriod);
}
