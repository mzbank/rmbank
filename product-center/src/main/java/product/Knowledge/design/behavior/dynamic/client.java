package product.Knowledge.design.behavior.dynamic;

import product.Knowledge.design.behavior.dynamic.Dy.DyObject;
import product.Knowledge.design.behavior.dynamic.impl.Book;

import java.lang.reflect.Proxy;

public class client {

    public static void main(String[] args) {
        Book book = new Book();
        DyObject object = new DyObject(book);
        BookStore store = (BookStore) Proxy.newProxyInstance(Book.class.getClassLoader(),
                Book.class.getInterfaces(), object);
        store.SellZbook();
    }
}
