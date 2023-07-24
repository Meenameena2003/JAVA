import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int Num = obj.nextInt();
		for(int row=1;row<=Num;row++,System.out.println("\n"))
		{
			for(int col=1;col<=row;col++)
			{
                System.out.printf("* ");
			}
		}
        int space=(Num-row)*2;
        for(int col=1;col<=space;col++)
        {
            System.out.printf(" ");
            for(int col=1;col<=row;col++){
                System.out.printf("*");
            }
        }
		for(int row=Num;row>=1;row--,System.out.println("\n"))
		{
         
			for(int col=1;col<=row;col++)
			{
				System.out.printf("* ");
			}
		}
        for(int i=1;i<=Num*2;i++)
        {
            System.out.printf(" ");
            for(int j=Num-1;j>=Num;j++)
            {
                System.out.printf("*");
            }
        }
		
}
}