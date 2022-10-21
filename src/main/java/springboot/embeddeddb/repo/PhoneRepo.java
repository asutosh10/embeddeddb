package springboot.embeddeddb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.embeddeddb.entity.PhoneNumbers;

@Repository
public interface PhoneRepo extends JpaRepository<PhoneNumbers,Integer> {
}
