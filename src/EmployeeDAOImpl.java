import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private DBConnection db;

    public EmployeeDaoImpl() {
    }

    @Override
    public boolean insertEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        return false;
    }

    @Override
    public boolean deleteEmployee(int empId) {
        return false;
    }

    @Override
    public Employee searchEmployee(int empId) {
        return null;
    }

    @Override
    public List<Employee> searchEmployeeByName(String name) {
        return null;
    }

    @Override
    public Employee searchEmployeeBySSN(String ssn) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }
}