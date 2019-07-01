package product.Knowledge.design.behavior.dynamic.impl;

import product.Knowledge.design.behavior.dynamic.BookStore;

public class Book implements BookStore {
    @Override
    public void SellZbook() {
        System.out.println("卖电子书");
    }
}
