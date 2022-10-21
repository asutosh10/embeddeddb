package springboot.embeddeddb.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.embeddeddb.entity.Cart;
import springboot.embeddeddb.request.CartRequest;
import springboot.embeddeddb.response.CartResponse;
import springboot.embeddeddb.repo.CartRepo;

import java.util.Optional;

@RestController
public class CartController {
    private final CartRepo cartRepo;

    public CartController(CartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }
@GetMapping("/myapp/cart/{id}")
    public ResponseEntity<CartResponse> getAll(@PathVariable Long id){
        Optional<Cart> byId = cartRepo.findById(id);
    CartResponse cartResponse=new CartResponse();
    cartResponse.setCartId(byId.get().getCartId());
    cartResponse.setUsername(byId.get().getUsername());
    cartResponse.setCartItems(byId.get().getCartItems());
        return ResponseEntity.ok().body(cartResponse);
    }
    @PostMapping("/myapp/cart/throughrequest")
    public ResponseEntity<?> save(@RequestBody CartRequest cartRequest){
        Cart cart=new Cart();
        cart.setCartId(cartRequest.getCartId());
//        cart.setUsername(cartRequest.getUsername());
        Cart save = cartRepo.save(cart);
        return ResponseEntity.ok().body(save);
    }
    @PostMapping("/myapp/cart/throughentity")
    public ResponseEntity<?> save(@RequestBody Cart cart){
        Cart save = cartRepo.save(cart);
        return ResponseEntity.ok().body(save);
    }
}
