package rafislab_6_1;
import java.util.Scanner;
public class Rafislab_6_1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial number: ");
        int i=input.nextInt();
        System.out.print("Enter final number: ");
        int f=input.nextInt();
        int s=sum_range(i,f);
        System.out.println("sum= "+s);
    }
    public static int sum_range(int a,int b){
        int sum=0;
        for (int i = a; i <= b; i++) {
            sum=sum+i;
        }
        return sum;
 
    }
    
}
