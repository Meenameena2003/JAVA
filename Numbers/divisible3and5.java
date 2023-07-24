import java.util.*;
class user
{

  public static void main(String args[])
  {
    int num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number:");
    num=sc.nextInt();

    if(num%3==0)
       System.out.println("Hii!");
    else if(num%5==0)
       System.out.println("Hello!");
    else if(num%3==0)&&(num%5==0)
       System.out.println("HiiHello!");
    else
    {
       System.out.println("The Number Is Not Divisible By 3.");
       
    }

  }

}