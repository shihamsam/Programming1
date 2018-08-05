public class Main {

    public static void main(String[] args) {

        int count1 = 10;
        int count2 = 5;
        int count3 = 5;


    }
    public static void main1(String[] args) {

         /*
         This is a comment
         write a program to print the following

            *
           *
          *


        */

        for(int i=3; i>0; i--){

            for(int j=1;j<i; j++ ){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        /*
            Print the following pattern
        *
        **
        ***

         */


        System.out.println("====================");
        for(int i=1; i< 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println("====================");

        /*
            Print the following pattern
        *
         *
          *

         */
        for(int i = 1; i<4; i++){
            for(int j=1 ; j <4; j++){
                if(i == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }
}
