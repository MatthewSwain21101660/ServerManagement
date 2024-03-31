package uk.ac.hope.mcse.segh.dbconfig.service;

import uk.ac.hope.mcse.segh.dbconfig.model.Employee;

import java.util.List;
import java.util.Optional;

public interface zOldlEmployeeDataService {

    List<Employee> findAllEmployees();
    Employee saveEmployee(Employee employee);
    Optional<Employee> findEmployeeById(Long id);
    void deleteEmployeeById(Long id);
}
