import java.util.*;

class adam_num {
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=s.nextInt();
        int temp=num;
        int rem=0,rev=0;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
         
        int power=temp*temp;
        System.out.println(power);
        int rem1=0,rev1=0;
        while(power!=0)
        {
            rem1=power%10;
            rev1=rev1*10+rem1;
            power=power/10;
        }

        double sqrt=Math.sqrt(rev1);

        System.out.println((int)sqrt);

        if(rev==(int)sqrt)
        System.out.println("It is Adam's number");
        else
        System.out.println("It is not an Adam's number");



    }
}