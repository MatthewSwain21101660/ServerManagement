package uk.ac.hope.mcse.segh.dbconfig.rest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import uk.ac.hope.mcse.segh.dbconfig.model.Employee;
import uk.ac.hope.mcse.segh.dbconfig.service.EmployeeDataService;
import uk.ac.hope.mcse.segh.dbconfig.service.EmployeeDataServiceImpl;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeControllerTest {

    EmployeeController controller;

    @BeforeEach
    void setUp() {

        // Mock the service
        EmployeeDataServiceImpl employeeDataService = mock(EmployeeDataServiceImpl.class);
        Employee e = new Employee("John", "Doe", 50, "Waster");
        e.setId(1L);
        Optional<Employee> employee = Optional.of(e);
        when(employeeDataService.findEmployeeById(1L)).thenReturn(employee);

        controller = new EmployeeController(employeeDataService);
    }

    @Test
    void all() {
    }

    @Test
    void newEmployee() {
    }

    @Test
    void findById() {
        Employee employee = controller.findById(1L);
        assertEquals(employee.getAge(), 50);
    }

    @Test
    void replaceEmployee() {
    }

    @Test
    void deleteEmployee() {
    }
}