import java.util.Scanner;
public class forloopdemo {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        for(int i=n;i>=1;i--)
        {
            sum+=i;
           System.out.println(i);
        }
      System.out.println(sum);
    }
}

