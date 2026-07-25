public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = new DBConnection();

        EmployeeDao employeeDao =
                new EmployeeDaoImpl();

        EmployeeManager employeeManager =
                new EmployeeManager(employeeDao);

        ReportGenerator reportGenerator =
                new ReportGenerator(employeeDao);

        EmployeeUI employeeUI =
                new EmployeeUI(employeeManager, reportGenerator);

        employeeUI.displayMenu();
    }
}
