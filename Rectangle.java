
import java.util.Scanner;
public class Rectangle {
    static int area(int l, int b){
        int area = l * b;
        return area;
    }
    static int perimeter(int l, int b){
        int perimeter = 2 * (l + b);
        return perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        System.out.println("Area of Rectangle: " + area(l, b));
        System.out.println("Perimeter of Rectangle: " + perimeter(l, b));
        sc.close();

    }
}
