package task2;
import java.util.Scanner;

public class CountryInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Country country = new Country();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Search");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter country name: ");
                    scanner.nextLine(); // Consume newline character
                    String countryName = scanner.nextLine();
                    System.out.print("Enter capital name: ");
                    String capitalName = scanner.nextLine();
                    country.add(countryName, capitalName);
                    System.out.println("Country and capital added successfully!");
                    break;
                case 2:
                    System.out.print("Enter country name to search: ");
                    scanner.nextLine(); // Consume newline character
                    String searchCountry = scanner.nextLine();
                    String capital = country.search(searchCountry);
                    System.out.println("Capital: " + capital);
                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please select a valid option (1-3).");
            }
        }
    }
}
