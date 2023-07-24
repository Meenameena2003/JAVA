import java.util.*;
class user
{

  public static void main(String args[])
  {
    int num,rem;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number:");
    num=sc.nextInt();
    rem=num%3;

    if(num%3==0)
       System.out.println("The Number Is Divisible By 3.");

    else
    {
       System.out.println("The Number Is Not Divisible By 3.");
       System.out.println("The reminder is "+rem);
    }

  }

}
