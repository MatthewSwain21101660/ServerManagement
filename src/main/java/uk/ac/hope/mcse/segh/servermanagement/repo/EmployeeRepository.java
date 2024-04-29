package uk.ac.hope.mcse.segh.servermanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.hope.mcse.segh.servermanagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
