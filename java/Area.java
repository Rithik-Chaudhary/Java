import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int l,b;
        System.out.print("Enter length: ");
        l = sc.nextInt();
        System.out.print("Enter breadth: ");
        b = sc.nextInt();
        int area = l*b;
        System.out.print("Area of rectangle: " + area);
        sc.close();

    }
    
}
