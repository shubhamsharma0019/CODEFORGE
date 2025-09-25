import java.util.Scanner;

public class Sum_Of_Natural_No {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        
        int sum = 0;
        for(int i=1;i<=n;i++){
           sum = sum +i;
        }
        System.out.println(sum);
    }
    
}
