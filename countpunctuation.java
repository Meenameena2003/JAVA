import java.util.*;
class Countpunctuation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        String str=sc.nextLine();
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++){
            if((c[i] >='A'&& c[i]<='Z') || (c[i]>='a' && c[i]<='z')){
                continue;
            }
            else{
                count++;
            }
        }System.out.print(count);
    }
}
/*
i'm a good_girl!!
6
*/