mport java.util.Scanner;
class strong_number {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=s.nextInt();
        int temp=num;
        int rem=0,sol=0;

        while(num!=0)
        {
            int fact=1;
            rem=num%10;
            for(int i=1;i<=rem;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
            sol=sol+fact;
            num=num/10;
        }

        if(sol==temp)
        System.out.println("It is a strong number");
        else
        System.out.println("It is not a strong number");
    }
    
}