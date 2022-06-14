
package rafislab3;
import java.util.Scanner;
public class rafislab3_4 {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        System.out.println("Enter any number");
        int num=input.nextInt();
        switch(num%2){
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
            default:
                System.out.println("invalid input");
        }
    }
    
}
