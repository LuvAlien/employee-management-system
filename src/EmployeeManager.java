import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;
    private EmployeeDao dao;

    public EmployeeManager(EmployeeDao dao) {
        employees = new ArrayList<>();
        this.dao = dao;
    }

    public void addEmployee(Employee employee) {
    }

    public void updateEmployee(Employee employee) {
    }

    public void deleteEmployee(int empId) {
    }

    public Employee searchById(int empId) {
        return null;
    }

    public List<Employee> searchByName(String name) {
        return null;
    }

    public Employee searchBySSN(String ssn) {
        return null;
    }

    public int updateSalaryRange(
            double low,
            double high,
            double percentage) {
        return 0;
    }

    public List<Employee> getEmployees() {
        return null;
    }
}
