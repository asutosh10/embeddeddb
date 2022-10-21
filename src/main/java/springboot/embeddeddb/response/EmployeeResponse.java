package springboot.embeddeddb.response;

import lombok.Data;
import springboot.embeddeddb.entity.Address;
import springboot.embeddeddb.entity.PhoneNumbers;

import javax.persistence.*;
import java.util.Set;

@Data
public class EmployeeResponse {
    private Integer empId;
    private String name;
    private Set<PhoneNumbers> phoneNumbers;
    private Set<Address> addresses;
}
