import java.util.*;

public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int x=scanner.nextInt();

        System.out.print("Enter the total amount: ");
        int N=scanner.nextInt();

        System.out.print("Enter the prices of items separated by space: ");
        int[]prices =new int[x];
        for (int i=0; i<x; i++) {
            prices[i] = scanner.nextInt();
        }

        boolean isSumPossible = isSumPossible(x, N, prices);
        System.out.println(isSumPossible);
    }

    public static boolean isSumPossible(int x, int N, int[] prices) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < x; i++) {
            int rem = N - prices[i];
            if (set.contains(rem)) {
                return true;
            }
            set.add(prices[i]);
        }

        return false;
    }
}