import java.util.*;

class amstrong_number {
    
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int rem=0,count=0,temp=num;
        double power=0,ams=0;
        while(num!=0)
        {
            rem=num%10;
            num=num/10;
            count=count+1;
        }while(temp!=0)
        {
            rem=temp%10;
            power=Math.pow(rem,count);
            ams=ams+power;
            temp=temp/10;


        }

        System.out.println((int)ams);
    }
    
}