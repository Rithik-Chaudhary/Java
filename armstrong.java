
import java.util.Scanner;
public class armstrong {
    static int length(int x)
    {
        int l = 0;
        while (x > 0) {
            x = x / 10;
            l++;
          }
          return(l);
    }
    static int power(int x, int y)
    {
        int temp = 1;   
        while(y != 0){
            temp *= x;
            --y;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int len = armstrong.length(n);
        System.out.println(len);
        System.out.println(power(2, 3));
        sc.close();


    
}}
