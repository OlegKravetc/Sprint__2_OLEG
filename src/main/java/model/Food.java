package model;

public abstract class Food {
    protected int amount; // кол-во
    protected double price; //цена
    protected boolean isVegetarian; //вегетерианское

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
