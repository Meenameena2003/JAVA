import java.util.*;
class user
{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int row,colm,num;
        System.out.println("Enter a number :");
        num=sc.nextInt();
        
        for( row=1;row<=num;row++,System.out.print("\n"))
        {
            for( colm=1;colm<=num;colm++)
            
                System.out.print(row%2);
            
        }
    }
}
        