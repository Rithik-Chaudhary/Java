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
    float bs = sc.nextFloat();
    float gs = bs + Salary.findHra(bs) + Salary.findDa(bs) + 2000;
    float net_salary = gs - gs * 10 / 100;
    System.out.println("Name: " + name);
    System.out.println("Gross Salary: " + net_salary);
    sc.close();




}
}
