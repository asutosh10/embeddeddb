package springboot.embeddeddb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import springboot.embeddeddb.entity.Address;
import springboot.embeddeddb.repo.AddressRepo;

import java.util.Optional;

@RestController
public class AddressController {
    private final AddressRepo addressRepo;

    public AddressController(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @GetMapping("/myapp/address/{id}")
    public ResponseEntity<?> getbyId(@PathVariable Integer id){
        Optional<Address> byId = addressRepo.findById(id);
        return ResponseEntity.ok(byId.get());
    }
}
