package uk.ac.hope.mcse.segh.dbconfig.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.hope.mcse.segh.dbconfig.exception.EmployeeNotFoundException;
import uk.ac.hope.mcse.segh.dbconfig.model.Employee;
import uk.ac.hope.mcse.segh.dbconfig.service.EmployeeDataService;
import uk.ac.hope.mcse.segh.dbconfig.service.EmployeeDataServiceImpl;

import java.util.List;

@RestController
class EmployeeController {

    private final EmployeeDataService employeeDataService;

    @Autowired
    EmployeeController(EmployeeDataService employeeDataService) {
        this.employeeDataService = employeeDataService;
    }

    @GetMapping("/employees")
    List<Employee> all() {
        return employeeDataService.findAllEmployees();
    }

    @PutMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return employeeDataService.saveEmployee(newEmployee);
    }

    @GetMapping("/employees/{id}")
    Employee findById(@PathVariable Long id) {

        return employeeDataService.findEmployeeById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PostMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

        return employeeDataService.findEmployeeById(id)
                .map(employee -> {
                    employee.setFirstName(newEmployee.getFirstName());
                    employee.setRole(newEmployee.getRole());
                    return employeeDataService.saveEmployee(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return employeeDataService.saveEmployee(newEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        employeeDataService.deleteEmployeeById(id);
    }
}

