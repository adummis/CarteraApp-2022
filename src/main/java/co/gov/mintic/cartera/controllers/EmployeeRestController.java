package co.gov.mintic.cartera.controllers;

import co.gov.mintic.cartera.entities.EmployeeEntity;
import co.gov.mintic.cartera.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public EmployeeEntity findById(@PathVariable int id){
        return employeeService.findById(id);
    }
    @GetMapping("/employee")
    public List<EmployeeEntity> findAll(){
        return this.employeeService.findAll();
    }

    @PostMapping("/employee")
    public EmployeeEntity createEmployee (@RequestBody EmployeeEntity employee){
        return this.employeeService.createEmployee(employee);
    }

    @PutMapping("/employee")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employee){
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable int id){
        this.employeeService.deleteEmployee(id);
    }
}
