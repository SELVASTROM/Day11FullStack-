import java.util.*;
public class Nested {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter the size of the array:");
            int n = s.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array values:");
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println("Enter the index you have to find it in array");
            int index=s.nextInt();
            System.out.println("The array index element of you entered is "+arr[index]);
             }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception caught "+ e);
            }
            try{
                System.out.println("Enter the value 1");
                int value1=s.nextInt();
                System.out.println("Enter the second value");
                int value2=s.nextInt();
                int c=value1/value2;
                System.out.println("the values of values1 and value2 is "+c);
        }catch(ArithmeticException m){
            System.out.println("Your Exception is caught "+m);
        }catch (Exception ex){

        System.out.println("some other exception occured "+ex);
        }
        System.out.println("The program runs like a butter");
        s.close();
    }
    
}
