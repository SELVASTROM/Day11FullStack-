import java.io.*;
public class Filereader {
//     public static void main(String[] args) {
//         try{
//         FileReader n = new FileReader("TryCaatch.java");
//         System.out.println("🫡 file found");
//         int ch = n.read();
//         System.out.println("First Character is found " + (char)ch);
//         n.close();
//         }catch(FileNotFoundException e){
//             System.out.println("you entered file is not found " + e);
//         }catch(IOException m){
//             System.out.println("the file is not able to read " + m);
//         }
//         System.out.println("Progarm runs without termanating");

        
//     }

    
// }
// using file writer
public static void main(String[] args) {
   
    try{

         FileWriter f=new FileWriter("C:/nonexistent-folder/sudmma.txt");// it can able to create the file in folder not in dierectory
;
         f.write("Hello selva ia am selva future");
         f.close();
    }catch(IOException v){
        System.out.println("The file is able to write"+v.getMessage());
    }
    System.out.println("the content is add so view in your text file");
}
}
