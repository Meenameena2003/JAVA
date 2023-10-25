import java.util.*;
class Leftrotate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int last=arr[n-1];
        System.out.print(last+" ");
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
/*
5
1 2 3 4 5 
5 1 2 3 4
*/