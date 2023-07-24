import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int Num = obj.nextInt();
		for(int row=1;row<=Num;row++,System.out.println("\n"))
		{
			for(int col=1;col<=row;col++)
			{  				System.out.print(" * ");
			}
		}
		
		
}
}