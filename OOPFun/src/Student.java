public class Student implements IStudent{

    private  String name;
    private String dob;


    @Override
    public void payFee(double fee) {

        System.out.println("Here is the Fee Hassan Sir, " + fee);

    }
}
