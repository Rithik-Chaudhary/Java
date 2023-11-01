
public class Prime_num {

    public static void main(String[] args) {
        int num = 100007;
        int iter = 0;
        boolean prime = true;
        if(num % 2 == 0 || num % 3 == 0)
        {
            prime = false;
        }
        for(int i = 5; i * i < num ; i+=6){
            iter++;
            if(num % 1 == 0 || num % (i+2) == 0)
            {
                prime = false;
                break;
            }
        }
        if(prime = true)
        {
            System.out.println(num + " is prime.");
        }
        else
        {
            System.out.println(num + " is not prime.");
        }
        System.out.println("No. of itertions = " + iter);
    }
}
