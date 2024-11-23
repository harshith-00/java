import java.util.Scanner;

public class IterateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.println("Iterating over the characters in the string:");
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);  
            System.out.println(ch);
        }

        // Alternative: Iterate using a for-each loop over the characters (as a char array)
        System.out.println("Using for-each loop:");
        for (char ch : inputString.toCharArray()) {
            System.out.println(ch);
        }

        scanner.close();
    }
}
