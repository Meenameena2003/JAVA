import java.util.*;
class Anagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ss=sc.nextLine();
        if(s.length()==ss.length()){
            for(int i=0;i<s.length();i++){
                for(int j=0;j<ss.length();j++){
                    if(s.charAt(i)==ss.charAt(j)){
                        System.out.print(s.charAt(i));
                    }
                }
            }
        }
    }
}