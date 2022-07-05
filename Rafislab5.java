package rafislab5;
import java.util.Scanner;
public class Rafislab5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum=0;
        int[] a=new int[6];
        System.out.print("Enter array");
        for (int in = 0; in < 6; in++) {
            a[in]=input.nextInt();
            
        }
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        System.out.println("sum= "+sum);
        double avg=sum/a.length;
        System.out.println("avg= "+avg);
        int count=0;
        for (int j = 0; j < 6; j++) {
            if (a[j]>avg) {
                count++;
            }
        }
        int result=(count*100)/6;
        System.out.println("Above avg= "+result+"%");
    }
    
}
