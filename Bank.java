import java.util.*;
class Bank {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter your account balance");
        double balance=s.nextDouble();
        System.out.println("Enter the withdraw amount");
        double witdraw=s.nextDouble();
        if(balance>witdraw) {
            System.out.println("Withdrawal amount "+witdraw+" is sucessfully withdrawed "+(balance-=witdraw));
        }else{
            throw new BalanceLowException("Insufficient funds ");
        }
    }catch (BalanceLowException e){
        
    System.out.println("Exception caught "+e);

    }
    
    System.out.println("the program runs fine");
}
}
class BalanceLowException extends Exception {
    public BalanceLowException (String message){
        super(message);
    }
}
