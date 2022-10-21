package springboot.embeddeddb.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CartRequest {
    @JsonProperty("CART_ID")
    private long cartId;
    @JsonProperty("USER_NAME")
    private String username;
}
