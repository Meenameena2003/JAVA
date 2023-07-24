import java.util.*;
class Fib{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1,n3;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            n3=n1+n2;
            System.out.print(n3);
            n1=n2;
            n2=n3;
        }
    }
}