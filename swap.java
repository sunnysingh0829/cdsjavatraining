import java.util.*;
class swap
{
     public static void main(String args[])
     {
     Scanner sc=new Scanner (System.in);
     int a,b,x,y;
     System.out.println("Using third variable");
     System.out.println("Enter the value of a and b");
     a=sc.nextInt();
     b=sc.nextInt();
     
     int temp=a;
     a=b;
     b=temp;
     System.out.println("After swapping\n" + "a="+a+ " " + "b="+b);
     System.out.println("Without using third variable");
     System.out.println("Enter the value of x and y");
     x=sc.nextInt();
     y=sc.nextInt();
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("After swapping\n" + "x="+x+ "  " + "y="+y);

     }

}