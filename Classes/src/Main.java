public class Main {

    public static void main(String[] args) {
	// write your code here


        ContractEmployee emp = new ContractEmployee() ;

        emp.setSalary(20);

    }


    public static void setSalary(float salary, int hourRate, int totalHours){
        salary = hourRate * totalHours;
    }

    public static void setSalary(Employee emp, int hourRate, int totalHours){
       emp.setSalary(hourRate * totalHours);
    }

}
