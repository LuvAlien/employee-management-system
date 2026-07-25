public class Person {
    String firstName;
    String lastName;
    int age;
    
    public Person(String fn, String ln, int a) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
}
