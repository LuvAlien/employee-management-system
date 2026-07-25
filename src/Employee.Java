public class Employee extends Person {
    private int empId;
    private String ssn;
    private double salary;
    private String jobTitle;
    private String division;

    public Employee() {
        super();
        empId = 0;
        ssn = "";
        salary = 0.0;
        jobTitle = "";
        division = "";
    }

    public Employee(String firstName, String lastName, int age,
                    int empId, String ssn, double salary,
                    String jobTitle, String division) {

        super(firstName, lastName, age);
        this.empId = empId;
        this.ssn = ssn;
        this.salary = salary;
        this.jobTitle = jobTitle;
        this.division = division;
    }

    public void updateSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId
                + "\nName: " + getFullName()
                + "\nAge: " + getAge()
                + "\nSSN: " + ssn
                + "\nSalary: $" + salary
                + "\nJob Title: " + jobTitle
                + "\nDivision: " + division;
    }
}