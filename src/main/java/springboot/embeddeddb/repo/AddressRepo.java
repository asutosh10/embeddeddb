package springboot.embeddeddb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.embeddeddb.entity.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {
}
