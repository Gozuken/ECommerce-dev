public class Payment 
{
    public int calculateTotal(Basket basket)
    {
        int total = 0;
        for (int i = 0; i < basket.getItemsInBasket().size(); i++)
        {
            total += basket.getItemsInBasket().get(i).getPrice();
        }
        return total;
    }

    public void pay(Basket basket)
    {
        // Check if the basket is empty before continuing

        int total = calculateTotal(basket);
        System.out.println("Total fee : " + total + " ₺");

        // Add logging for each payment
    }
}
