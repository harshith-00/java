import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        firstString = firstString + secondString;  
        secondString = firstString.substring(0, firstString.length() - secondString.length());  
        firstString = firstString.substring(secondString.length());  
        
        System.out.println("After swapping:");
        System.out.println("First string: " + firstString);
        System.out.println("Second string: " + secondString);

        scanner.close();
    }
}
