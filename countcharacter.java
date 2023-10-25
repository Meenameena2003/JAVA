import java.util.*;
class CountCharacter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        String str=sc.nextLine();
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i] != ' '){
                count++;
            }
        }System.out.print(count);
    }
}
/*
i love java
9
*/