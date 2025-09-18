import java.util.Scanner;

public class If_Else{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n =scn.nextInt();

        if(n>=18){
            System.out.println("Eligible for vote");
        }else{
            System.out.println("Not eligible for vote");
        }
    }
    
}

// we take input by the user
// After taking input we apply conditional statement and check for user is eligible for voting or not eligible for vote.
// I am print the answer as per the condition is correct or not.