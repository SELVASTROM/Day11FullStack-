import java.util.*;
public class Student {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("enter the number of subjects");
            int size=s.nextInt();
            int arr[]=new int[size];
            System.out.println("Enter the marks");
            for(int i=0;i<size;i++){
                arr[i]=s.nextInt();
            }
            int total=0;
            for(int value:arr){
                if(value>0 && value <101){
                  total+=value;
                              
                }else{
                    throw new InvalidMarkExceptions("In the given marks the sum or numbers is no a valid mark ");
                }
            }
            int avg=total/size;
            System.out.println("The total marks you got is "+total+"\n the avergage marks you got is "+avg);

        }catch(InvalidMarkExceptions e){
            System.out.println("Exception caught "+e);
        }
        System.out.println("Program works fine");
        s.close();
    }
    
}
class InvalidMarkExceptions extends Exception{
    public InvalidMarkExceptions (String message){
        super(message);
    }
}
