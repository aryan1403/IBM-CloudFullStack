package java03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class coll {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(35);
        list.add(-1);
        list.add(0);

        list.remove(3);

        // System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i));
        }

        for (Integer i : list) {
            // System.out.println(i);
        }

        int i = 0;
        while (i < list.size()) {
            // System.out.println(list.get(i));
            i++;
        }

        Iterator<Integer> it = list.iterator();
        // while(it.hasNext()) {
        //     // System.out.println(it.next());
        // }

        list.forEach(e -> System.out.println(e));
        // list.forEach(System.out::println);

        // list.forEach(new Consumer<Integer>() {
        //     @Override
        //     public void accept(Integer t) {
        //         System.out.println(t);
        //     }
        // });

    }
}
