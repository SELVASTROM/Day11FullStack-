import java.util.*;
class Arrayindex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int num=s.nextInt();
        int arr[]=new int[num];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<num;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the  index values to access in the array ");
        int access_value=s.nextInt();
        try{
            System.out.println("Array Index Values is "+arr[access_value]);
        }catch(ArrayIndexOutOfBoundsException v){
            System.out.println("The Exception is caught "+v);
        }
        System.out.println("The code will continuous running ");
        s.close();
    }
    
}
