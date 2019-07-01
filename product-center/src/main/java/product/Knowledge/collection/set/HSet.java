package product.Knowledge.collection.set;

import product.Knowledge.collection.list.User;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HSet {

    public static void main(String[] args) {
        Set<User> set =new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set.add(new User("zs"+i,"sdf"));
        }
        Iterator<User> iterator = set.iterator();
        while (iterator.hasNext()){
            User next = iterator.next();
            if (next.getName().equals("zs70")){
                System.out.println(next);
            }
        }
        System.out.println(set);
    }
}
