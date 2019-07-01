package product.Knowledge.collection.set;

import product.Knowledge.collection.list.User;

import java.util.LinkedHashSet;
import java.util.Set;

public class LHSet {

    public static void main(String[] args) {
        Set<User> set = new LinkedHashSet<>();

        for (int i = 0; i < 100; i++) {
            set.add(new User("zs"+i,"sdf"));
        }

        System.out.println(set);
    }
}
