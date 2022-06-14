package rafislab3;

import java.util.Scanner;

public class rafislab3_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = input.nextInt();
        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekdays");
                break;
            case 6:
            case 7:
                System.out.println("weekends");
                break;
            default:
                System.out.println("invalid input");
        }
    }
}
