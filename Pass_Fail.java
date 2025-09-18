import java.util.Scanner;

public class Pass_Fail {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int n = scn.nextInt();

        if(n>=35){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
    
}

// Firstly we take input by the user and apply conditional on it
// second check if marks greater then 35 print pass otherwise fail

