package org.busra;

import java.util.SplittableRandom;
import java.util.UUID;

public class Customer {
    private final String customerId;
    private String name;
    private String surname;
    private Basket basket;

    public Customer(String name, String surname){
        this.customerId = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
    }

    public String getCustomerId(){
        return customerId;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString(){
        return "Customer {" +
                "ID: " + customerId + ", " +
                "Name: " + name + ", " +
                "Surname: " + surname + ", " +
                "Basket Total Price: " + basket.getTotalPrice() +
                "}" + "\n";
    }
}
