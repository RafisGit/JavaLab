package rafislab2;
import java.util.Scanner;
public class rafislab2 {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in); 
        System.out.println("Enter any number: ");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    
}
