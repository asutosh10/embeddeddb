package springboot.embeddeddb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "EMP_ID")
    private Integer empId;
    @Column(name = "NAME")
    private String name;
    @OneToMany(mappedBy = "employee")
    private Set<PhoneNumbers> phoneNumbers;
    @OneToMany(mappedBy = "employee")
    private Set<Address> addresses;
}
