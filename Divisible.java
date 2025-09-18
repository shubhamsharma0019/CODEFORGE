import java.util.Scanner;

public class Divisible {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = scn.nextInt();

        if(n%2==0 || n%3==0){
            System.out.println("Divisible");
        }else{
            System.out.println("not divisible");
        }
    }
    
}

// we take input by the user as per user demand 
// After we apply conditional statement and check if input is divisible by 2 and 3 then print divisible 
// Otherwise print not divisible
