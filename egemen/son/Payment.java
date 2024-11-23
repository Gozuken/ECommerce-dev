public class Payment {
    public int calculateTotal(Basket basket) {
        int total = 0;
        for (BasketItem item : basket.getItemsInBasket()) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public boolean pay(Basket basket) {
        return false; // Placeholder to be overridden by subclasses
    }
}
