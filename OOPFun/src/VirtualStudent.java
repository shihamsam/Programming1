public class VirtualStudent implements IStudent {


    @Override
    public void payFee(double fee) {
        System.out.println("Here is the Fee through my Credit Card, Hassan Sir " + fee);
    }
}
