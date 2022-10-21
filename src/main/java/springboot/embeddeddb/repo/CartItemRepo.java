package springboot.embeddeddb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.embeddeddb.entity.CartItem;

@Repository
public interface CartItemRepo extends JpaRepository<CartItem,Long> {
}
