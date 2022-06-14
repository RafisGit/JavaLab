package rafislab3;

import java.util.Scanner;

public class rafislab3_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your grade");
        char grade = input.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Range:90-100");
                break;
            case 'B':
                System.out.println("Range:80-89");
                break;
            case 'C':
                System.out.println("Range:70-79");
                break;
            case 'D':
                System.out.println("Range:60-69");
                break;
            case 'F':
                System.out.println("Range:0-59");
                break;
            default:
                System.out.println("invalid input");
        }
    }

}
