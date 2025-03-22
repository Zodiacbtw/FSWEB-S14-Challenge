package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition1Name, double addition1Price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition1Name, double addition1Price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    /*@Override
    public void addHamburgerAddition4(String addition1Name, double addition1Price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }*/
}
