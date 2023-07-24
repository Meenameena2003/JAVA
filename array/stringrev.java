import java.io.*;
import java.util.*;

class Copy {

    public static void main(String[] args) {
        String A,rev="";
        
        Scanner sc=new Scanner(System.in);
        A=sc.nextLine();
        
        /* Enter your code here. Print output to STDOUT. */
        int len=A.length();
        for(int i=len-1;i>=0;i--){
            
             rev=rev+A.charAt(i);
        }
        if(A.equals(rev)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
        
        
    }
}



