package service;

import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {

        double sum = 0;

        for (Food food : foods) {
            sum += food.getPrice() * food.getAmount();
        }

        return sum;
    }

    public double getTotalPriceWithDiscount() {

        double sum = 0;

        for (Food food : foods) {

            double price = food.getPrice() * food.getAmount();

            if (food instanceof Discountable) {
                double discount = ((Discountable) food).getDiscount();
                price = price * (100 - discount) / 100;
            }

            sum += price;
        }

        return sum;
    }

    public double getVegetarianTotalPriceWithoutDiscount() {

        double sum = 0;

        for (Food food : foods) {
            if (food.isVegetarian()) {
                sum += food.getPrice() * food.getAmount();
            }
        }

        return sum;
    }
}