import java.util.*;
class user
{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        if(num%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("not Leap Year");
        }
    }
}