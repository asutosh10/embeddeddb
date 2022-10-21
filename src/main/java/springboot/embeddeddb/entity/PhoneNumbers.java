package springboot.embeddeddb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PhoneNumbers implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "PHONE_ID")
    private Integer phoneId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "EMP_ID",referencedColumnName ="EMP_ID" )
    @JsonIgnore
    private Employee employee;
    @Column(name = "PHONE_NUMBER")
    private Long phoneNo;

}
