

public class Pattern{
    public static void main(String[] args) {
        int n = 3;
        int m = 2*n;
        for(int i = 0 ; i <= m; i++){
            for(int j = 0; j <= m ; j++){
                int value = n -Math.min( Math.min(i,j), Math.min(m-i,m-j));
                System.out.print(value + " ");

            }
            System.out.println();
        }


    }
}
   