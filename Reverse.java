public class Reverse {

    public static void main(String[] args) {
        int rev = 0;
        int n = 1234;
        while (n != 0) {
           int  rem = n % 10;
           rev = rev * 10 + rem;
           n = n / 10;
        }
        System.out.println(rev);
    }

}