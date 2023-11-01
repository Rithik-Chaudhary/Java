
public class nonrepeatingelement {
    public static void main(String[] args) {
        int arr[] = {9, 4, 9, 6, 7, 4};
        int flag = 0;
        int a = 0;
        for(int i = 0; i  < arr.length; i++)
        {
            flag = 0;
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[j] == arr[i])
                {
                    flag++;
                }
            }
            if(flag != 2)
            {
                a = arr[i];
                break;
            }
           }
           System.out.println("First non repeating element is " + a);
    }
    
}
