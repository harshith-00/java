import java.util.Scanner;

public class InsertString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();

        
        System.out.print("Enter the string to insert: ");
        String stringToInsert = scanner.nextLine();

        
        System.out.print("Enter the position to insert the string (0 to " + originalString.length() + "): ");
        int position = scanner.nextInt();

        
        if (position < 0 || position > originalString.length()) {
            System.out.println("Invalid position!");
        } else {
            
            String resultString = originalString.substring(0, position) + stringToInsert + originalString.substring(position);

            
            System.out.println("Resulting string: " + resultString);
        }

        scanner.close();
    }
}
