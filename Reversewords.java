import java.util.*;
class Reversewords{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.print(rev);
        for(int i=0;i<str.length();i++){
            
        }
    }
}
/*
boolean
naeloob
*/