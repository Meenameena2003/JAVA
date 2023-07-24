import java.util.*;
import java.math.*;
class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int sum=0;
        long product=1;
        long modulo=1000000007;
        if(q==1){
            for(int i=1;i<=n;i++){
                sum=sum+i;
            }
            System.out.println(sum);
        }
        else if(q==2){

            for(int i=1;i<=n;i++){
                product=(product *i)%modulo;
            }
            System.out.println(product);
        }
        else{
            int m=10^9+7;

            System.out.print(m);
        }
        
    }//input:product length=4, number of cuts=2, cut array holding the order of cuts 13 output:7?      
}