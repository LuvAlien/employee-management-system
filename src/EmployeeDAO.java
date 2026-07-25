import java.util.List;

public interface EmployeeDao {
    boolean insertEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    boolean deleteEmployee(int empId);

    Employee searchEmployee(int empId);

    List<Employee> searchEmployeeByName(String name);

    Employee searchEmployeeBySSN(String ssn);

    List<Employee> getAllEmployees();
}