import java.util.*;
class upper{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        char val = sc.next().charAt(0);  
       
        if(Character.isUpperCase(val)){
            System.out.println("Upper Case");
        }
        else{
            System.out.println("Lower case");
        }
    }
}