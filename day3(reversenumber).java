import java.util.*;
// reverse the number 
public class reversenumber {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int reversed = 0;

        while(n != 0){
            int digit = n % 10;       // for getting last digit
            reversed = reversed * 10 + digit;  // append digit
            n = n / 10;               // remove last digit
        }

        System.out.println("Reversed number = " + reversed);
    }
}
