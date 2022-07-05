package rafislab_6_1;
import java.util.Scanner;
public class rafislab_6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4 numeber: ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
        smallest_number(a,b,c,d);
        
    }
    public static void smallest_number(int a,int b,int c,int d){
      
       if(a==b&&a==c&&a==d){
           System.out.println("all are equal");
       }
        
       else  if(a<b&&a<c&&a<d){
           System.out.println("smallest= "+a);
       }
       else if(b<c&&b<d){
           System.out.println("smallest= "+b);
       }
       else if(c<d){
           System.out.println("smallest= "+c);
       }
       else{
           System.out.println("smallest= "+d);
       }
      
           
    }
    
}
