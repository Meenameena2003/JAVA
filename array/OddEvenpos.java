import java.util.*;
class OddEvenposition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i+=2){
            System.out.print(arr[i]+" ");
        }System.out.println();
        for(int i=0;i<n;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}
/*
6
1 2 3 4 5 6
2 4 6
1 3 5

*/
