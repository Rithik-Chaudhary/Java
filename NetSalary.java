
import java.util.Scanner;
public class NetSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        float bs = sc.nextFloat();
        float hra = bs * 30 / 100;
        float ta = bs * 20 / 100;
        float da = bs * 10 / 100;
        float pf = 1500;
        float ns = bs + hra + da + ta - pf;
        System.out.print("Net salary: " + ns);
        sc.close();
        
    }
}
