import java.util.Scanner;

public class GetCharacterFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        
        System.out.print("Enter the position (starting from 0): ");
        int position = scanner.nextInt();

        
        if (position < 0 || position >= inputString.length()) {
            System.out.println("Invalid position. Please enter a value between 0 and " + (inputString.length() - 1));
        } else {
            
            char character = inputString.charAt(position);
            System.out.println("Character at position " + position + ": " + character);
        }

        scanner.close();
    }
}
