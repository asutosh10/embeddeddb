package springboot.embeddeddb.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class CartItemKey implements Serializable {
    private static final Long serialVersionUID=1L;
    private Long productId;
    private Long cartId;

}
