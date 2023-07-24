import java.util.*;
class upper{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        char val = sc.next().charAt(0); 

       
        if((val>='a'&& val<='z')||(val>='A' && val<='Z')) {
            System.out.println("Alphebets");
        }
        else if (val>='0' && val<='9'){
            System.out.println("Digits");
        }
        else{
            System.out.println("Symbols");
        }
    }
}