package uk.ac.hope.mcse.segh.servermanagement.service;

import org.springframework.stereotype.Service;
import uk.ac.hope.mcse.segh.servermanagement.model.Employee;
import uk.ac.hope.mcse.segh.servermanagement.repo.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class zOldlEmployeeDataServiceImpl implements zOldlEmployeeDataService {

    private final EmployeeRepository repository;

    public zOldlEmployeeDataServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Employee> findAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public Optional<Employee> findEmployeeById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        repository.deleteById(id);
    }
}
