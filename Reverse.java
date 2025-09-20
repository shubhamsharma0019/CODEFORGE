import java.util.Scanner;

public class Reverse {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();
        
        int result = 0;
        while(n>0){
            int p = n%10;
            result = result*10 + p;
            n = n/10;
        }
        System.out.println("Reverse number is:"+result);
    }
    
}
