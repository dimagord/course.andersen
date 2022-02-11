package Lesson_3;

public class Main {

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];

        employeeArray[0] = new Employee("John Wick","CEO","bigboss@email.com","+96464542346", "$100000",50);
        employeeArray[1] = new Employee("Pennywise","clown","penny@email.com","+96464567654", "$100",150);
        employeeArray[2] = new Employee("Candy man","chef","yummy@email.com","+9646412946", "$66958",90);
        employeeArray[3] = new Employee("Harry Potter","executer","avadakedavra@email.com","+96464778554", "$0",10);
        employeeArray[4] = new Employee("Cookie Monster","co-chef","cooookiiie@email.com","+96464846512", "1 cookie",5);

        for (Employee employee:employeeArray){
            if(employee.getAge()>40){
                employee.info();
            }
        }
    }
}
