package product.Knowledge.collection.list;

import java.util.Comparator;
import java.util.LinkedList;

public class LKList {

    public static void main(String[] args) {
        LinkedList<User> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new User("zs"+i,"sdfwe"));
        }
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int i = o1.getName().compareTo(o2.getName());
                if (i >0) {
                    return -1;
                }else {
                    return 1;
                }
            }
        });
        list.add(new User("zs65","sdfwe"));
        System.out.println(list.get(4));
        System.out.println(list);
    }
}
