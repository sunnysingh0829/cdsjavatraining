import java.util.*;
public class findlength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the string: ");
        str=sc.nextLine();
        int len=0;
        for(char a:str.toCharArray()){
            len++;
        }
        System.out.println("Length of the string is: "+len);
    
}
}
