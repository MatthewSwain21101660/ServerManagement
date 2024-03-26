package uk.ac.hope.mcse.segh.dbconfig.service;

import org.springframework.stereotype.Service;
import uk.ac.hope.mcse.segh.dbconfig.model.Employee;
import uk.ac.hope.mcse.segh.dbconfig.repo.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDataServiceImpl implements EmployeeDataService {

    private final EmployeeRepository repository;

    public EmployeeDataServiceImpl(EmployeeRepository repository) {
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
