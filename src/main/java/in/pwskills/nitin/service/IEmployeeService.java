package in.pwskills.nitin.service;

import java.util.List;
import in.pwskills.nitin.model.Employee;

public interface IEmployeeService {

    void saveEmployee(Employee employee);

    List<Employee> findAllEmployee();

    Employee getEmployeeById(Integer id);

    void deleteEmployeeById(Integer id);
}


