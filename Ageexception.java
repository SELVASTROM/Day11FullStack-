// import java.util.Scanner;

// class Ageexception {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         try{
//         System.out.println("Enter the age of yours");
//         int age=s.nextInt();
//         if(age > 18) {
//             System.out.println("you are eligible to vote boi");
//         } else {
//             throw new UnderageException("You are not eligible to vote.");
//         }
        
//     } catch(UnderageException e) {
//         System.out.println(e.getMessage());
//     }
    
// }
// }

// class UnderageException extends Exception {
//     public UnderageException(String message) {
//         super(message);
//     }
// }

import java.util.*;
class Ageexception{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
        System.out.println("Enter your age");
        int age=s.nextInt();
        if(age>18){
            System.out.println("You are eligible to vote");
        }else{
            throw new UnderAgeException("you are not eligible to vote because you are under age 18");
        }
    }catch(UnderAgeException e){
        System.out.println("Exception caught "+e.getMessage());
    }
    System.out.println("The program runns smothly");
        
    }
}
class UnderAgeException extends Exception{
           public UnderAgeException(String message){
            super(message);
           }
}