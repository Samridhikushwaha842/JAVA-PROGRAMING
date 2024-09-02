
import java.util.Scanner;

public class Format_a_Multiline_Address{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the street address: ");
        String street = scanner.nextLine();

        System.out.print("Enter the city: ");
        String city = scanner.nextLine();

        System.out.print("Enter the zip code: ");
        String zipCode = scanner.nextLine();

        String formattedAddress = "Address:\n" +
                "\t" + street + "\n" +
                "\t" + city + ",\n" +
                "\t" + zipCode;

        System.out.println(formattedAddress);
        scanner.close();
    }
}
