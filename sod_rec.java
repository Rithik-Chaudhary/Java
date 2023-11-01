import java.util.Scanner;
public class sod_rec {
    static int Sum_Of_Digits(int n){
        if (n == 0) 
         return 0; 
        return (n % 10 + Sum_Of_Digits(n / 10));
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Sum of Digits: " + Sum_Of_Digits(num));
        sc.close();


    }
}
