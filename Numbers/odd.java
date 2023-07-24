import java.util.*;
class odd{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2==0)
            continue;
            System.out.print(i+" ");
            
        }
    }
}