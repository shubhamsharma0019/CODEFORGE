import java.util.Scanner;

public class Pattern2 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of pattern:");
        int n = scn.nextInt();

        int str = 1;
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=str;j++){
                System.out.print(count+" ");
                count++;
            }
            str++;
            System.out.println();
        }
    }
    
}
