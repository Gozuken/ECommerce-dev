import java.util.ArrayList;

public class Basket 
{
    private final ArrayList<Product> itemsInBasket = new ArrayList<>();

    public void addItem(int itemId)
    {
        // Confirm negative amounts and out of stock values
        // Placeholder implementation of the add
        // Need a place where all products are stored to retrieve and add it to the basket from there
        //itemsInBasket.add()
    }

    public void removeItem(int itemId)
    {
        // Confirm values
        // Another placeholder
        //itemsInBasket.remove();
    }


    // Could be removed by changing the list to public
    // Not sure
    public ArrayList<Product> getItemsInBasket()
    {
        return itemsInBasket;
    }
}
