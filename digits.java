public class digits {
    void printDigits(int n){
        if(n == 0){
            return;
        }
        printDigits(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        digits obj = new digits();
        obj.printDigits(10);

    }
    
}
