import java.util.Scanner;
public class TempConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celcius: ");
        float cel = sc.nextFloat();
        float fh = cel * 9 / 5 + 32;
        System.out.print("Temperature in Fahrenheit: " + fh);
        sc.close();
    }
}
