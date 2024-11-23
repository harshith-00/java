import java.util.Scanner;
public class AddCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();
        System.out.print("Enter the character(s) to add: ");
        String additionalCharacters = scanner.nextLine();
        System.out.print("Enter the position to add the character(s) (starting from 0): ");
        int position = scanner.nextInt();
        if (position < 0 || position > originalString.length()) {
            System.out.println("Invalid position. Position must be between 0 and " + originalString.length());
        } else {
    String newString = originalString.substring(0, position) 
                             + additionalCharacters 
                             + originalString.substring(position);
            System.out.println("New string: " + newString);
        }
    }
}