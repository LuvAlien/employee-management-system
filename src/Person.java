public class Person {
    private String firstName;
    private String lastName;
    private int age;
    
    public Person(String fn, String ln, int a) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
}
