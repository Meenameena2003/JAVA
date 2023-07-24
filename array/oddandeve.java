//Odd and Even in Same Array
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Even \n");
        for(int i=0;i<n;i++){
            if(arr[i] %2 ==0){
                System.out.print(arr[i]);
            }
        }
        System.out.print("\nOdd:\n");
        for(int i=0;i<n;i++){
            if(arr[i]%2 !=0){
                System.out.print(arr[i]);
            }
        }
    }
}

