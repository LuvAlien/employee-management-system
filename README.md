# employee-management-system
Java and MySQL employee management system for the Software Development final project.
## Programming Tasks

1. **Database Connection**
   Connect the Java application to the MySQL `employeeData` database using JDBC.

2. **Employee Management**
   Allow users to add, update, and delete employee records in the database.

3. **Employee Search**
   Allow users to search for employees by employee ID, name, or SSN.

4. **Salary Update**
   Increase employee salaries by a selected percentage for employees within a specified salary range.

5. **Payroll Reports**
   Generate employee pay history, total monthly pay by job title, and total monthly pay by division.

---

## Java Classes

### `Main.java`

Runs the program, displays the console menu, collects user input, and calls methods from the other classes.

### `Employee.java`

Represents an employee and stores information such as employee ID, name, SSN, salary, job title, and division.

### `EmployeeDAO.java`

Contains the database methods used to add, search, update, and delete employee records.

### `DatabaseConnection.java`

Creates and returns the JDBC connection between the Java application and the MySQL database.

### `SalaryManager.java`

Updates the salaries of employees who fall within a specified salary range.

### `ReportManager.java`

Retrieves and displays the three required employee and payroll reports from the database.
