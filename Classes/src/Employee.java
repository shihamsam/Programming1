import org.omg.CORBA.PUBLIC_MEMBER;



abstract class Employee { // start pf class

    // instance variables
    public String name;
    private int age;
    protected float salary;

    // class variables
    public static int WORKING_HOURS = 8;

    // constructor
    public Employee() {
        System.out.println("I am created ! ");

    }

    public void work(int hourRate, int totalHours){
        salary = hourRate * totalHours;
    }

    public void work(int hourRate){
        salary = hourRate * WORKING_HOURS;
    }

    // this is a getter for name
    public String getName() {
        return name;
    }

    // this is a setter for name
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getSalary() {
        return salary;
    }

    abstract void setSalary(float salary) ;
} // end of class
