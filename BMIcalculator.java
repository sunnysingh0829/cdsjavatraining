import java.util.Scanner;
public class BMIcalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Weight in Kilograms(Kg):");
        double wt= sc.nextDouble();

        System.out.println("Enter Height in Meters(m):");
        double ht= sc.nextDouble();

        double bmi= wt/(ht*ht);

        System.out.println("Your BMI is :"+bmi);

        if(bmi<18.5)
        {
            System.out.println("You are Underweight.");
        }
        else if (bmi>=18.5 && bmi<24.9)
        {
            System.out.println("You Have normal Weight.");
        }
        else if (bmi>=25 && bmi<29.9)
        {
            System.out.println("You are Overweight.");
        }
        else
        {
            System.out.println("You are Obese.");
        }
    }
}
