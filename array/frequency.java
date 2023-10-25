import java.util.*;
class Frequency{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int visit=-1;
        int arr[]=new int[n];
        int brr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            brr[i]=-1;
        }
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    brr[j]=visit;
                }
            }
            if(brr[i] != visit){
                brr[i]=count;
            }
        }
        for(int i=0;i<n;i++){
            if(brr[i] != visit){
                System.out.print(arr[i]+" "+brr[i]);
            }
        }
        sc.close(); 
    }
}