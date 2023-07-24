import java.util.*;
class user{
    public static void main(String[] args)
    {
        int row,col;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:"); 
       int num=sc.nextInt();

       for( row=1;row<=num;row++,System.out.print("\n"))
        {
            for( col=1;col<=num;col++)
            

       if((col==num/2+1)|| (row==num/2+1))
       System.out.print("0 ");
       else{
        System.out.print("1 ");
       }
        }
    }
}