import java.util.*;
public class Vowel {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        long n = scanner.nextLong();
	        scanner.close();

	        int count = primesum(n);
	        System.out.println(count);
	    }

	    public static int primesum(long n) {
	        int count = 0;

	        for (long i = 5; i <= n; i += 2) {
	            if (isPrime(i)) {
	                long sum = 2;
	                long j = 3;
	                while (sum < i && j < i) {
	                    if (isPrime(j)) {
	                        sum += j;
	                        if (sum == i) {
	                            count++;
	                            break;
	                        }
	                    }
	                    j += 2;
	                }
	            }
	        }

	        return count;
	    }

	    public static boolean isPrime(long num) {
	        if (num == 2 || num == 3)
	            return true;
	        if (num % 2 == 0 || num == 1)
	            return false;
	        for (int i = 3; i <= Math.sqrt(num); i += 2) {
	            if (num % i == 0)
	                return false;
	        }
	        return true;
	    }
	}