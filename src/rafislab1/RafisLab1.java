package rafislab1;

import java.util.Scanner;

public class RafisLab1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any 10 number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int num6 = input.nextInt();
        int num7 = input.nextInt();
        int num8 = input.nextInt();
        int num9 = input.nextInt();
        int num10 = input.nextInt();
        System.out.print("The addition and substraction of first and last five numbers= "+(num1+num2+num3+num4+num5-num6-num7-num8-num9-num10));

    }
}
