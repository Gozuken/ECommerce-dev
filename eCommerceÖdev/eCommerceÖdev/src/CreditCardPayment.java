import java.util.Scanner;

public class CreditCardPayment extends Payment 
{
    String creditCardNumber;
    String expirationDate; 
    String CCV;

    @Override
    public void pay(Basket basket)
    {
        // Ask for confirmation before payment
        // Check if the basket is empty before continuing

        Scanner scanner = new Scanner(System.in);  

        // Validate before continuing
        System.out.println("Enter your credit card number : ");
        creditCardNumber = scanner.nextLine();

        System.out.println("Enter expiration date : ");
        expirationDate = scanner.nextLine();

        System.out.println("Enter CCV : ");
        CCV = scanner.nextLine();
        

        

        int total = calculateTotal(basket);
        System.out.println("Processing credit card payment for total fee : " + total + " ₺");

        // Add logging for each payment


        scanner.close();
    }
}
