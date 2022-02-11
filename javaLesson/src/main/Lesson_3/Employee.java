package Lesson_3;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private String salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber,String salary,int age){
        this.fullName=fullName;
        this.position=position;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
    }
    public void info() {
        System.out.println("Employee info-> Fullname: "+fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: "+email);
        System.out.println("Phone number: "+phoneNumber);
        System.out.println("Salary: "+salary);
        System.out.println("Age: "+age);
        System.out.println("-----------------------");
    }
    public int getAge(){
        return age;
    }
}
