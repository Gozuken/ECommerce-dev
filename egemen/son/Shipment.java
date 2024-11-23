
import java.util.Scanner;

public class Shipment {
    private String name;
    private String address;
    private String phone;

    public void collectShipmentDetails(Scanner scanner) {
        scanner.nextLine(); // Clear the input buffer after using nextInt()
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your address: ");
        address = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        phone = scanner.nextLine();
    }

    public void printShipmentDetails() {
        System.out.println("Shipment Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Your shipment will be processed soon. Thank you!");
    }
}
