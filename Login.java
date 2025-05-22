import java.util.*;
public class Login {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            String originalusername="SelvaMurugan K";
            String Password="Selva@12345";
            int times=3;
            while (times>0) {
            System.out.println("Enter the username");
            String inputusername=s.nextLine();
            System.out.println("Enter the passowrd");
            String inputpassword=s.nextLine();
    
                if(originalusername.equals(inputusername) && Password.equals(inputpassword)) {
                    System.out.println("Login Successful");
                    s.close();
                    return;
                } else  {
                    times--;
                    if(times>0){
                         System.out.println("Invalid credentials. Only " + times + " chances left!");

                    }
                }
            }      
            throw new LoginAttemptException("Sorry!  more than 3 times up you entered wrong password come and login after 24hrs");
        }catch(LoginAttemptException e){
           System.out.println(e.getMessage());
        
        }
        System.out.println("The programs works like butter");
    }
    

}
class LoginAttemptException extends Exception{
    public LoginAttemptException (String message){
        super(message);

    }
}
