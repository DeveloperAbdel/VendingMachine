package org.perscholas.terminalgame;

import java.io.IOException;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) throws IllegalArgumentException {
        if(name==null)
            throw new IllegalArgumentException(" Product name can not be null");
        else if(price < 0)
            throw new IllegalArgumentException("Price negetive IllegalArgumentException Occurred");
        else{
            this.name = name;
            this.price = price;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name == null)  throw new IllegalArgumentException(" Name can not be negative");
        else
            this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price)  {
        if (price < 0)  throw new IllegalArgumentException(" Price can not be negative");
        else
            this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
