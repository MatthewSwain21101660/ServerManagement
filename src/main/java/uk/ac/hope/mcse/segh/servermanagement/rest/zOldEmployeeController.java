package uk.ac.hope.mcse.segh.servermanagement.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uk.ac.hope.mcse.segh.servermanagement.exception.EmployeeNotFoundException;
import uk.ac.hope.mcse.segh.servermanagement.model.Employee;
import uk.ac.hope.mcse.segh.servermanagement.service.zOldlEmployeeDataService;

import java.util.List;

@RestController
class zOldEmployeeController {

    private final zOldlEmployeeDataService zOldlEmployeeDataService;

    @Autowired
    zOldEmployeeController(zOldlEmployeeDataService zOldlEmployeeDataService) {
        this.zOldlEmployeeDataService = zOldlEmployeeDataService;
    }

    @GetMapping("/employees")
    List<Employee> all() {
        return zOldlEmployeeDataService.findAllEmployees();
    }

    @PutMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return zOldlEmployeeDataService.saveEmployee(newEmployee);
    }

    @GetMapping("/employees/{id}")
    Employee findById(@PathVariable Long id) {

        return zOldlEmployeeDataService.findEmployeeById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PostMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {

        return zOldlEmployeeDataService.findEmployeeById(id)
                .map(employee -> {
                    employee.setFirstName(newEmployee.getFirstName());
                    employee.setRole(newEmployee.getRole());
                    return zOldlEmployeeDataService.saveEmployee(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return zOldlEmployeeDataService.saveEmployee(newEmployee);
                });
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        zOldlEmployeeDataService.deleteEmployeeById(id);
    }
}

