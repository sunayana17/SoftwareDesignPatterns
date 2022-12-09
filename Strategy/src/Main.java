import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("uyegf",665);
        Item item2 = new Item("ygf", 87);

        List<Item > items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        ShoppingCart shoppingCart = new ShoppingCart(items);

        shoppingCart.pay(new PaypalStrategy("uyre", "uegrf"));
        shoppingCart.pay(new CreditCardStrategy("uyrgyr","7777","rgre","tgr"));


    }
}