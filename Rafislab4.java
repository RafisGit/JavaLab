package rafislab4;

import java.util.Scanner;

public class Rafislab4 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int x=0,r,tem;
        System.out.println("Enter any number");
         r=input.nextInt();
        x=r;
        while(x!=0){
            tem=x%10;
            x=x/10;
            if (tem==0) {
                System.out.println("zero");
            }
            else if (tem==1) {
                System.out.println("one");
            }
            else if (tem==2) {
                System.out.println("two");
            }
            else if (tem==3) {
                System.out.println("three");
            }
            else if (tem==4) {
                System.out.println("four");
            }
            else if (tem==5) {
                System.out.println("five");
            }
            else if (tem==6) {
                System.out.println("six");
            }
            else if (tem==7) {
                System.out.println("seven");
            }
            else if (tem==8) {
                System.out.println("eight");
            }
            else {
                System.out.println("nine");
            }
            
        }
    }
    
}
