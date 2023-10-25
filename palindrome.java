import java.util.*;
class Palindrome{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char c;
        String temp="";
        for(int i=0;i<str.length();i++){
            c=str.charAt(i);
            temp=c+temp;
        }
        System.out.print(temp);
        if (str.equals(temp)){
            System.out.print("\nyes");
        }
        else{
            System.out.print("\nNo");
        }
    }
}
/*
palindromemordnilap
palindromemordnilap
yes
*/