import java.util.Scanner;

public class Odd_Even {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = scn.nextInt();

        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("odd");
        }
    }
    
}

// firstly we take input by the user and apply conditional statement on it
// After we check if number completely divide by 2 it is even number otherwise it is odd number
// And print the answer on the basis of number that is given by the user.

