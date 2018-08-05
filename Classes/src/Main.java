public class Main {

    public static void main(String[] args) {
	// write your code here

        float salary = 60;
        Employee emp = new Employee();
        emp.setSalary(50);

        //setSalary(salary, 10 , 8);
        setSalary(emp,10, 8);

        //System.out.println("Result after pass by value " + salary);
        System.out.println("Result after pass by reference " + emp.getSalary());

    }


    public static void setSalary(float salary, int hourRate, int totalHours){
        salary = hourRate * totalHours;
    }

    public static void setSalary(Employee emp, int hourRate, int totalHours){
       emp.setSalary(hourRate * totalHours);
    }

}
