
package rafislab3;
import java.util.Scanner;
public class rafislab3_5 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any number");
            int num=input.nextInt();
            for (int i = 2; i < num; i++) {
                if (num%i==0) {
                    System.out.println("Not a prime number");
                    
                }
                else
                    System.out.println("prime number");
                break;
        }
    }           
}
