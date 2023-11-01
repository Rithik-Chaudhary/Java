
import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        int sum = 0;
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        while(num != 0)
        {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.print("Sum of digits = " + sum);
        sc.close();
    }
}