import java.util.Scanner;
import java.lang.Math;
class jumpsearch
{
  public static void main(String args[])
  {
   Scanner sc= new Scanner(System.in); 
   int num=sc.nextInt();
   int arr[]=new int[num];
 
   for(int i=0;i<num;i++)
   {
     arr[i]=sc.nextInt();
   }   
   int step=(int)(Math.sqrt(num));
   int x=sc.nextInt();
   if(x>arr[num-1] || x<arr[0])
   {
     System.out.println("Element does not exist");
   }
   int i=0;
   int j=step;
   while(arr[j]<x && j<num){
    i=j;
    j=j+step; 
    if(j>num-1)
    {
     j=num-1;
    }
    }

   for(int k=i;k<=j;k++){
      if(arr[k]==x)
       {
        System.out.print(x + " is present in the list");
       }
    }
    }
}