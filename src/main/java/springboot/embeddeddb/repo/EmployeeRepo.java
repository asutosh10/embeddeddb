package springboot.embeddeddb.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import springboot.embeddeddb.entity.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
}
