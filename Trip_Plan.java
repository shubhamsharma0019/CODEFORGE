import java.util.Scanner;

public class Trip_Plan {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();

        if(n>=10000){
            System.out.println("goa");
        }else{
            System.out.println("murthal");
        }
    }
    
}

// firstly we take input from user 
// after we apply conditional statement if budjet is greater then 10000 trip will go to goa otherwise go to murthal
// And lastly we print answer as per demand.
