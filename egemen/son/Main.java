
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("T-Shirt", 150, 10, 1),
            new Product("Blue Jeans", 299.99f, 5, 2),
            new Product("Running Shoes", 499.99f, 8, 3),
            new Product("Digital Watch", 899.99f, 0, 4),
            new Product("Laptop Backpack", 249.99f, 15, 5)
        };
        Basket basket = new Basket();
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();
        Shipment shipment = new Shipment();

        System.out.println("Welcome!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Basket");
            System.out.println("3. View Basket");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Available Products:");
                    for (Product product : products) {
                        System.out.printf("ID: %d, Name: %s, Price: %.2f ₺, Stock: %d%n",
                                product.getItemId(), product.getName(), product.getPrice(), product.getStockQuantity());
                    }
                    break;
                case 2:
                    System.out.print("Enter Product ID to add to basket: ");
                    int productId = scanner.nextInt();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    boolean added = basket.addItem(productId, quantity, products);
                    if (added) {
                        System.out.println("Product added to basket.");
                    } else {
                        System.out.println("Failed to add product. Check stock or ID.");
                    }
                    break;
                case 3:
                    basket.viewBasket();
                    break;
                case 4:
                    if (basket.getItemsInBasket().isEmpty()) {
                        System.out.println("Basket is empty. Add items before checkout.");
                        break;
                    }
                    System.out.println("Choose Payment Method:");
                    System.out.println("1. Credit Card");
                    System.out.println("2. PayPal");
                    int paymentChoice = scanner.nextInt();
                    boolean paymentSuccessful = false;
                    if (paymentChoice == 1) {
                        paymentSuccessful = creditCardPayment.pay(basket);
                    } else if (paymentChoice == 2) {
                        paymentSuccessful = payPalPayment.pay(basket);
                    } else {
                        System.out.println("Invalid payment choice.");
                    }
                    if (paymentSuccessful) {
                        shipment.collectShipmentDetails(scanner);
                        shipment.printShipmentDetails();
                        System.out.println("Thank you for shopping!");
                        return;
                    }
                    break;
                case 5:
                    System.out.println("Thank you for shopping!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
