import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = scn.nextInt();
        
        for(int i=n;i>0;i--){
            System.out.println(i);
        }
    }
    
}
