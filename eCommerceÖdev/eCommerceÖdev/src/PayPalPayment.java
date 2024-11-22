import java.util.Scanner;

public class PayPalPayment extends Payment 
{
    private String paypalEmail;
    private String paypalPassword;

    @Override
    public void pay(Basket basket) 
    {
        // Check if the basket is empty before continuing
        // Ask for confirmation before payment

        Scanner scanner = new Scanner(System.in);  

        // Validate before continuing
        System.out.println("Enter your PayPal Mail : ");
        paypalEmail = scanner.nextLine();

        System.out.println("Enter your password : ");
        paypalPassword = scanner.nextLine();

        int total = calculateTotal(basket);
        System.out.println("Processing PayPal payment for total fee : " + total + " ₺");
        System.out.println("PayPal Email : " + paypalEmail);

        
        // Add logging for the payment
    }
}
