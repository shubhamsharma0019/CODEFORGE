import java.util.Scanner;

public class Divisible_2 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the input:");
        int n = scn.nextInt();

        if(n%2==0 && n%3==0){
            System.out.println("Divisible");
        }else{
            System.out.println("Not Divisible");
        }
    }
    
}

// we take a input as a number that number is check it is divisible by 2 and 3
// if number is divisible by 2 and 3 print divisible otherwise it is not divisible by 2 and 3.
