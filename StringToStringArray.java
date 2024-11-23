import java.util.Scanner;

public class StringToStringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        
        String[] stringArray = inputString.split(" ");         
        System.out.println("String array:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Element " + i + ": " + stringArray[i]);
        }

        scanner.close();
    }
}
