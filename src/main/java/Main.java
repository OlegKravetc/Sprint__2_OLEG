import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10,50,"red");
        Apple appleGreen = new Apple(8,60,"green");

        Food[] foods = { meat, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println(cart.getTotalPriceWithoutDiscount());
        System.out.println(cart.getTotalPriceWithDiscount());
        System.out.println(cart.getVegetarianTotalPriceWithoutDiscount());

    }
}
