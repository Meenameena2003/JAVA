import java.util.*;
class Largestnumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=0;
                if(arr[i]>arr[j]){
                     temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
        System.out.print("large:"+arr[n-1]+"\n");
        System.out.print("Small:"+arr[0]+"\n");
        System.out.print("count:"+arr.length+"\n");
        System.out.print("2nd large:"+arr[n-2]+"\n");
        System.out.print("3rd large:"+arr[n-3]+"\n");
    }
}
/*
9    
11 99 2 44 3 8 21 41 78
2 3 8 11 21 41 44 78 99
large:99
Small:2
count:9
2nd large:78
3rd large:44
*/