class Employee{
    int id;
    int salary;
    String name;
    public void getDetails(){
        System.out.println("My id is " + id);
        System.out.println("My salary is " + salary);
        System.out.println("My name is " + name);  
    }
    public int getSalary(){
        return salary;
    }
}
public class practiceprogram22 {
    public static void main(String[] args) {
        Employee harry = new Employee();
        // instantiating a new employee object
        Employee john = new Employee();
        // Setting the attribute for harry
        harry.id = 12;
        harry.name = "Arpit gupta";
        harry.salary = 45000;
        // Setting the attribute for john
        john.id = 45;
        john.name = "kunal chutiya";
        john.salary = 78000;
        // printing the attribute
        harry.getDetails();
        john.getDetails();
    }
}
