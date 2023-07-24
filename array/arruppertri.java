import java.util.*;
class arruppertri{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        } System.out.print("----------------   ");
        for(int i=0;i<row;i++,System.out.print("\n")){
            for(int j=0;j<col;j++){
                if(i>j){
                    arr[i][j]=0;
                }
            
        System.out.print(arr[i][j] +" ");
        }
        }

    }
}