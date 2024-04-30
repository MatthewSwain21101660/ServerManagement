package uk.ac.hope.mcse.segh.servermanagement.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import uk.ac.hope.mcse.segh.servermanagement.model.HardwareReadings;

public interface HardwareReadingsRepository extends MongoRepository <HardwareReadings, Long > {
}
