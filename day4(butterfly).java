/*
*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *


*/
class Main {
    public static void main(String[] args) {

        int n = 6;                
        int spaces = 2*n - 2;

        for(int i = 1; i <= 2*n - 1; i++) {

            int stars = i;
            if(i > n) stars = 2*n - i;   // mirror logic

            // Left stars
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }

            // Middle spaces
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }

            // Right stars
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }

            // Space control logic
            if(i < n) spaces -= 2;
            else spaces += 2;

            System.out.println();   // NEW LINE
        }
    }
}
