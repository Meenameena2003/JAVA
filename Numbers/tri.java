import java.util.Scanner;
class triperfect_num
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int sum=0,temp;
        temp=3*num;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }  
        if(sum==temp)
        {
            System.out.println("this is triperfect number");
        }
        else
            System.out.println("this is not triperfect number");
    }
}