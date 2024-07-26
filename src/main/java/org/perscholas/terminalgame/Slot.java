package org.perscholas.terminalgame;

public class Slot<T extends Product> {
    private T product;
    private int quantity;

    public Slot(T product, int quantity) throws IllegalArgumentException {
        if (product == null)
            throw new IllegalArgumentException(" Product can not be Null");
        else if (quantity < 0)
            throw new IllegalArgumentException(" Quantity can not be negative");
        else {
            this.product = product;
            this.quantity = quantity;
        }
    }

    public T getProduct() {
        return product;
    }

    public void setProduct(T product) {
        if (product == null) throw new IllegalArgumentException("Product can not be null");
        else
            this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws IllegalArgumentException {
        if (quantity< 0) throw new IllegalArgumentException("Quantity can not be negative");
        else
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
