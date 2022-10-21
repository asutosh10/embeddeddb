package springboot.embeddeddb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot.embeddeddb.entity.Address;
import springboot.embeddeddb.entity.PhoneNumbers;
import springboot.embeddeddb.repo.AddressRepo;
import springboot.embeddeddb.repo.PhoneRepo;

import java.util.Optional;

@RestController
public class PhoneController {
    private final PhoneRepo phoneRepo;

    public PhoneController(PhoneRepo phoneRepo) {
        this.phoneRepo = phoneRepo;
    }

    @GetMapping("/myapp/phone/{id}")
    public ResponseEntity<?> getbyId(@PathVariable Integer id){
        Optional<PhoneNumbers> byId = phoneRepo.findById(id);
        return ResponseEntity.ok(byId.get());
    }
}


