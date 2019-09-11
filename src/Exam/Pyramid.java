package Test;

public class Pyramid {

    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *


        for (int i = 0; i < 6; i++) {

            //spaces
            for (int j = 6 - i; j > 1; j--) {
                System.out.print(" ");
            }

            //stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }


}