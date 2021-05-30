package pl.rl.emploeey.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rl.emploeey.domain.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
