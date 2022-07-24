package javaapplication19;

public class JavaApplication19 {
    public static int sum;
    public static int sum(int a,int b){
        sum=a+b;
        return sum;
    }
     public static int sum(int a,int b,int c){
        sum=a+b+c;
        return sum;
    }
      public static int sum(int a,int b,int c,int d){
        sum=a+b+c+d;
        return sum;
    }
       public static double sum(double a,double b){
        double sum=a+b;
        return sum;
    }
        public static void sumofnumber1(int a,double b){
            double sum=a+b;
            System.out.println("sum"+sum);
        
    }
        public static void sumofnumber2(double a,int b){
       double sum=a+b;
            System.out.println("sum"+sum);
        
    }
    public static void main(String[] args) {
        System.out.println("sum:"+sum(1,2,3,4));
        sumofnumber1(1,1.1);
        sumofnumber2(2.1,1);
        
    }
    
}
