public class Example2 extends Example1{
    @Override
    void sayBow() {

        System.out.println("BOW BOW");
    }

    public static void main(String[] args) {
        Example2 ex2 = new Example2();

        ex2.sayName();
        ex2.sayBow();
    }
}
