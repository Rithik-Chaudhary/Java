public class Pattern1 {
    public static void main(String[] args) {
        for(int i = 0; i < 6; i++)
        {
            System.out.print("* ");
        }
        System.out.println();
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 12; j++)
            {
                if(j == 0 || j == 10)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = 0; i < 6; i++)
        {
            System.out.print("* ");
        }

    }
    
}
