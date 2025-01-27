public class Employee {
    
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    
    public Employee() {
    }

    
    public Employee(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getFullName() {
        return firstName + " " + lastName;
    }

    
    public static void main(String[] args) {
        
        Employee emp1 = new Employee(1, "John", "Doe", "123 Main St");
        System.out.println("Employee 1 Full Name: " + emp1.getFullName());

        
        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setFirstName("Jane");
        emp2.setLastName("Smith");
        emp2.setAddress("456 Elm St");
        System.out.println("Employee 2 Full Name: " + emp2.getFullName());
    }
}
