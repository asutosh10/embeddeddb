package springboot.embeddeddb.response;

import lombok.Data;
import springboot.embeddeddb.entity.CartItem;

import java.io.Serializable;
import java.util.List;
@Data
public class CartResponse implements Serializable {
    private static final Long serialVersionUID=1L;
    private Long CartId;
    private String username;
    private List<CartItem> cartItems;
}
