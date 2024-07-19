import java.util.*;
public class repeatednames
 {
    
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter\n");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter elements of the Array\n");
        for(int i=0;i<n;i++)
         {
            arr[i] = sc.nextLine();
         }

            System.out.println("Repeated elements are:\n");
            for(int i=0;i<n;i++)
             {
                for(int j=i+1;j<n;j++)
                 {
                    if(arr[i].equals(arr[j])) 
                    {
                        System.out.println(arr[i]);
                    }
                }
             }
    }
}
            

           

    

