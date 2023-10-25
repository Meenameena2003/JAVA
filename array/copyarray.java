import java.util.*;
class Copyarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int brr[];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        brr=arr;
        for(int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
/*
5
1 2 3 4 5
1 2 3 4 5
*/