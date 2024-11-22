public class Main 
{
    public static void main(String[] args) 
    {
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


        System.out.println("Welcome to AEShop!");

        for (int i = 0; i < products.length(); i++)
        {
            
        }
        while (true) 
        { 
            System.out.println("Please enter the ID of the item you want to purchase : ");
        }

    }
    
}
