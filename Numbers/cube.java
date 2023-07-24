import java.util.Scanner;
class prfct_cbe
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        double cnum = Math.cbrt(num);
        System.out.println(cnum);
        int cube = (int)cnum*(int)cnum*(int)cnum;
        if(cube==num)
        {
            System.out.println("This is perfect cube");
        }
        else
        System.out.println("This is not perfect cube");
    }
}