import java.util.*;
class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int temp=0;
            for(int j=0;j<n;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Ascending:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nDescending:");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}
/*
5
1 6 4 2 3
Ascending:1 2 3 4 6
Descending:6 4 3 2 1
*/