import  java.util.*;

class pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){//row
            System.out.print("\n"); 
            for(int j=n-1;j>=i;j--){//col 
                /*if(i>j){
                    System.out.print(" ");
                }else{*/
                System.out.print("*");}
            }
            //System.out.println();
        }
    }
