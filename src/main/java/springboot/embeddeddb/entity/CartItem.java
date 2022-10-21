package springboot.embeddeddb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@IdClass(CartItemKey.class)
@Table(name = "CART_ITEM")
@Data
public class CartItem implements Serializable {
    public static final Long serialVersionUID = 1L;
    @Id
    @Column(name = "PRODUCT_ID")
    private Long productId;


    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "CART_ID",referencedColumnName = "ID")
    @JsonIgnore
    private Cart cartId;

    @Column(name = "CUSTOMER_ID")
    private Long customerId;


}
