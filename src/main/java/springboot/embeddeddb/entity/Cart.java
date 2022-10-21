package springboot.embeddeddb.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "CART")
public class Cart implements Serializable {
    private static final Long serialVersionUID = 1L;
    @Id
    @Column(name = "ID")
    private Long cartId;

    @Column(name = "USER_NAME", nullable = false, columnDefinition = "varchar(255) default 'John Snow'")
    private String username;
    @OneToMany(mappedBy = "cartId")
    private List<CartItem> cartItems;

}
