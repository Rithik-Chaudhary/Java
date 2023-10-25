import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Class: ");
        String clas = sc.nextLine();
        System.out.print("Enter Physics marks: ");
        int phy = sc.nextInt();
        System.out.print("Enter Biology marks: ");
        int bio = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int che = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int mat = sc.nextInt();
        System.out.print("Enter English marks: ");
        int eng = sc.nextInt();
        int percent = (phy + bio + che + mat + eng) / 5;
        System.out.print("Name: " + name);
        System.out.print("Class: " + clas);
        System.out.print("Percentage: " + percent);
        sc.close();





    }
}
