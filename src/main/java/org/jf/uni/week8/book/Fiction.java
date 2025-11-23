package org.jf.uni.week8.book;

public class Fiction extends Book{
    public Fiction(String title) {
        super(title);
        setPrice(24.99);
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
