/*
* * * *
 * * *
  * *
   *
*/


public class InversePyramid {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for(int i = 0; i < n; i++) {
            // print spaces
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print stars
            for(int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
