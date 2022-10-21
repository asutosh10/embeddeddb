package springboot.embeddeddb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot.embeddeddb.entity.Employee;
import springboot.embeddeddb.repo.EmployeeRepo;
import springboot.embeddeddb.response.EmployeeResponse;

import java.util.Optional;

@RestController
public class EmployeeController {
    private final EmployeeRepo employeeRepo;

    public EmployeeController(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    @GetMapping("myapp/employee/{id}")
    public ResponseEntity<?> getAllEmployeesById(@PathVariable Integer id){
        Optional<Employee> byId = employeeRepo.findById(id);
        EmployeeResponse employeeResponse=new EmployeeResponse();
        employeeResponse.setEmpId(byId.get().getEmpId());
        employeeResponse.setName(byId.get().getName());
        employeeResponse.setPhoneNumbers(byId.get().getPhoneNumbers());
        employeeResponse.setAddresses(byId.get().getAddresses());
        return ResponseEntity.status(200).body(employeeResponse);
    }
}
