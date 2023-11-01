
import java.util.Scanner;
public class Salary{
static float findHra(float x){
    float hra = x * 30 / 100;
    return(hra);
}
static float findDa(float x){
    float da = x * 20 / 100;
    return(da);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Name: ");
    String name = sc.nextLine();
    System.out.print("Enter basic salary: ");
    float basic_salary = sc.nextFloat();
    float gross_salary = basic_salary + Salary.findHra(basic_salary) + Salary.findDa(basic_salary) + 2000;
    float net_salary = gross_salary - gross_salary * 10 / 100;
    System.out.println("Name: " + name);
    System.out.println("Gross Salary: " + net_salary);
    sc.close();
}
}
