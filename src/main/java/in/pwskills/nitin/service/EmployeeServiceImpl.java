package in.pwskills.nitin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskills.nitin.model.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private List<Employee> employees = new ArrayList<>();

    @Override
    public void saveEmployee(Employee employee) {
        // Implementation for saving employee
        employees.add(employee);
    }

    @Override
    public List<Employee> findAllEmployee() {
        // Implementation for finding all employees
        return new ArrayList<>(employees);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        // Implementation for finding an employee by ID
        Optional<Employee> result = employees.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
        return result.orElse(null);
    }

    @Override
    public void deleteEmployeeById(Integer id) {
        // Implementation for deleting an employee by ID
        employees.removeIf(e -> e.getId().equals(id));
    }
}






	
	
	
	
