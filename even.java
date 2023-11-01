public class even {
    void printEven(int n){
        if(n == 0 ){
            return;
        }
        printEven(n-2);
        System.out.println(n-2);

    }
    public static void main(String[] args) {
        even obj = new even();
        obj.printEven(20);
    }
    
}
