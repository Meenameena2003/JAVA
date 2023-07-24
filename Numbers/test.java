import java.util.*;
import java.lang.*;

class test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0 && arr[i]<0){
                System.out.print(arr[i]);
            }
            //for(int j=0;j<i-1;j++){
             /*   int j = i - 1;
            while (j >= 0 && arr[j] > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            int v=arr[n];
            if(v>=0 && v<=j){
                System.out.print(v);*/
            }
            }
            
        }
    
