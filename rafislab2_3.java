import java.util.Scanner;
public class rafislab2_3 {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
          System.out.println("Enter 3 numbers:");
            int num1=input.nextInt();
            int num2=input.nextInt();
            int num3=input.nextInt();
            int largest=num1;
            if (num1>num2 && num1>num3){
                System.out.println("largest= "+num1);
            }
            else if(num2>num1 && num2>num3 ){
                System.out.println("largest= "+num2);
               
            }
            if(num2>num3 && num2>num1){
                System.out.println("largest= "+num3);
            }
            else{
                System.out.println("All numbers are equal");
              }
            double radious1=3.1416*largest*largest;
   
}
}
