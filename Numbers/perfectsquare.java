import java.util.*;
class PerfectSquareCount {
    
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
    
    public static int countPerfectSquares(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPerfectSquare(arr[i])) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        int count = countPerfectSquares(arr[]);
        System.out.println( count);
    }
}
