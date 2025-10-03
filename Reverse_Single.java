import java.util.Scanner;

public class Reverse_Single {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = scn.nextInt();
        
        while(n>0){
            int p = n%10;
            System.out.print(p);
            n = n/10;
        }
    }   
    
}
