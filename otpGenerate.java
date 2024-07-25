import java.util.Random;
public class otpGenerate {
    public static void main(String[] args) {
        //to generate 6 digit otp using Random class
        Random sc=new Random();
        int myOtp=sc.nextInt(1000000);
        System.out.println("Your OTP is:"+myOtp+" \n"+"Don't Share to anyone");
    }
}
