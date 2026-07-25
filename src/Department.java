import java.util.ArrayList;

public class Department {
    private int departmentId;
    private String departmentName;
    private String division;
    private ArrayList<Employee> employees;

    public Department() {
        departmentId = 0;
        departmentName = "";
        division = "";
        employees = new ArrayList<Employee>();
    }

    public Department(int departmentId, String departmentName, String division) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.division = division;
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
