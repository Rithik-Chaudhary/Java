
import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height: ");
        float height = sc.nextFloat();
        System.out.print("Enter Weight: ");
        float weight = sc.nextFloat();
        float BMI = weight / (height * height);
        System.out.print("BMI is: " + BMI);
        sc.close();

    }
}
