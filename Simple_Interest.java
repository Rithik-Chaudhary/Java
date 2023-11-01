
import java.util.Scanner;
public class Simple_Interest {
    static int findSI(int p, int r, int t){
        int si = (p * r * t) / 100;
        return si;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int p = sc.nextInt();
        System.out.print("Enter Rate of interest: ");
        int r = sc.nextInt();
        System.out.print("Enter Time: ");
        int t = sc.nextInt();
        int res = findSI(p, r, t);
        System.out.print("Simple Interest: " + res);
        sc.close();


    }
    
}
