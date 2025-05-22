import java.util.Scanner;

public class Nullpointer {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
        System.out.println("Enter the String value");
        String input=s.nextLine();
        String e = null;
        System.out.println("the length of the string is "+input.length());
        System.out.println("The String length is "+e.length());

    }catch(NullPointerException m){
        System.out.println("Exception caught "+m);
    }
    System.out.println("Then the program will continuous dont! worry");
    s.close();
    }
    
}
