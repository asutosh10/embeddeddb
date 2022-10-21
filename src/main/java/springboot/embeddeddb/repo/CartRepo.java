package springboot.embeddeddb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.embeddeddb.entity.Cart;
@Repository
public interface CartRepo extends JpaRepository<Cart,Long> {
}
