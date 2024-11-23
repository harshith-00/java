import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

      
        String[] words = inputString.trim().split("\\s+");
        
              int wordCount = (inputString.trim().isEmpty()) ? 0 : words.length;

        System.out.println("Number of words: " + wordCount);
    }
}
