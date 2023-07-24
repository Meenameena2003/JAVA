import java.util.*;
class searchlinear{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int flag =0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        } 
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
             flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.print("no");
        }else{
            System.out.print("yes");
        }
    }
}