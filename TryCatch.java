import java.util.*;
class TryCatch{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number you have to divide : ");
        int num1 = s.nextInt();
        System.out.println("Enter the second number you have to divide");
        int num2=s.nextInt();
        try{
            int input=num1/num2;
            System.out.println("result"+input);
        }catch(ArithmeticException e){
            System.out.println("Exception Caught "+e);
        }
        System.out.println("Code continues....");
        s.close();
    }
}