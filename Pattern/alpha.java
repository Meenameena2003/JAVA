import java.util.*;

public class Alpha{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("no.of.words: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("String: ");
        String wordsString = scanner.nextLine();

        String[] words = wordsString.split(" ");
        sortWords(words);

        System.out.println("output: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    public static void sortWords(String[] words) {
        Arrays.sort(words, (a, b) -> {
            return a.compareToIgnoreCase(b);
        });
    }
}