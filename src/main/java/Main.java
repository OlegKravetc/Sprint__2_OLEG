import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10,50, Colour.RED);
        Apple appleGreen = new Apple(8,60,Colour.GREEN);

        Food[] foods = { meat, appleRed, appleGreen};
        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println("Общая сумма без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма вегетарианских продуктов: " + cart.getVegetarianTotalPriceWithoutDiscount());

    }
}
