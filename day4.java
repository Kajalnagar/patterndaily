/*
* * * * * * * * * * * * 
* * * * *     * * * * * 
* * * *         * * * * 
* * *             * * * 
* *                 * * 
*                     * 
*                     * 
* *                 * * 
* * *             * * * 
* * * *         * * * * 
* * * * *     * * * * * 
* * * * * * * * * * * *
*/




class Main {
    public static void main(String[] args) {
        int n = 6;
        int inis = 0;

        // Upper part 
        for (int i = 0; i < n; i++) {

            // Left stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }

            // Middle spaces 
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }

            inis += 4;   // gap growth 
            System.out.println();
        }

        inis -= 4; // adjust for lower part

        // Lower part 
        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 0; j < inis; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            inis -= 4;   // gap shrink
            System.out.println();
        }
    }
}
