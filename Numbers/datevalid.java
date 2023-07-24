import java.util.*;
class user{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int hour =sc.nextInt();
        int min =sc.nextInt();
        int sec =sc.nextInt();
        if((hour>=0 && hour<24)&&(min>=0 && min<60)&&(sec>=0 && sec>60))
        {
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}