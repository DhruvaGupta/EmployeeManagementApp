package in.pwskills.nitin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import in.pwskills.nitin.model.Employee;
import in.pwskills.nitin.service.IEmployeeService;
@Controller
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private IEmployeeService service;

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {
        model.addAttribute("employee", new Employee());
        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute Employee employee) {
        service.saveEmployee(employee);
        return "redirect:/employees/list";
    }

    @GetMapping("/list")
    public String listEmployees(Model model) {
        List<Employee> employees = service.findAllEmployee();
        model.addAttribute("employees", employees);
        return "employees/list-employees"; // Corrected path here
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable Integer id, Model model) {
        Employee employee = service.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employees/employee-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        service.deleteEmployeeById(id);
        return "redirect:/employees/list";
    }

    // Additional method to handle home page request
    @GetMapping("/home")
    public String homePage() {
        return "redirect:/employees/list";
    }
}


