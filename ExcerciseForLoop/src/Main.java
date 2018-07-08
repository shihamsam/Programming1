public class Main {

    public static void  main(String[] a) {
       // _ _ *
       // _ * _
       // * _ _


        // First Way of writing the for loop
        for (int i=1 ; i<4; i++){ // this loop controls the number of rows
            for (int j = 4; i < j ; j--) { // this loop defines the number of spaces to print in each round
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println("====================");

        // Another Way of handling the for loop
        for(int i=3;i>0; i--){
            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

    }


}
