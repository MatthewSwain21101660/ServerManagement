package uk.ac.hope.mcse.segh.dbconfig.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.hope.mcse.segh.dbconfig.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
