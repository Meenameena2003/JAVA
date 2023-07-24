import java.util.*;

class LargestPrimeFactor {
  public static long largestPrimeFactor(long n){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:"); 
    n=sc.nextInt();

    int i = 2;
    while(i != n){
      if(n%i == 0)
        n = n/i;
      else 
        i++;
    }
    return n;
  }
  public static void main(String[] args) {
    System.out.println(largestPrimeFactor(600851475143L));
  }
}