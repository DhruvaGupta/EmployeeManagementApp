package in.pwskills.nitin.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import in.pwskills.nitin.model.Employee;

public interface IEmployeeDao extends JpaRepository<Employee, Long> {
    
}

