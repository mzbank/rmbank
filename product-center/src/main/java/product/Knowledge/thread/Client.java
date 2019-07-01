package product.Knowledge.thread;

import product.Knowledge.thread.normal.Daughter;
import product.Knowledge.thread.normal.Son;

public class Client {

    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        for (int i = 0; i < 10; i++) {
            Son son = new Son();
            son.start();
        }

        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(daughter);
            t1.start();
        }

    }
}
