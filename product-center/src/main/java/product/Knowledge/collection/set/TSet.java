package product.Knowledge.collection.set;

import product.Knowledge.collection.list.User;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TSet {

    public static void main(String[] args) {
        Set<User> set = new TreeSet<User>(
                new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int i = o1.getName().compareTo(o2.getName());
                if (i>0){
                    return -1;
                }else {
                    return 1;
                }
            }
        });
        for (int i = 0; i < 100; i++) {
            set.add(new User("zs"+i,"sdf"));
        }
        System.out.println(set);

        User first = ((TreeSet<User>) set).first();
        SortedSet<User> users = ((TreeSet<User>) set).headSet(new User("zs65", "sdf"));
        System.out.println(users);
    }
}
