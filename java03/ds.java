package java03;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class stackex {
    stackex() {
        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(34);
        stack.push(56);

        stack.pop();

        System.out.println(stack.size());
        System.out.println(stack.get(0));
        stack.clear();

        System.out.println(stack);
    }
}

class queueex {
    queueex() {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(23);
        q.offer(34);
        q.offer(56);

        q.poll();

        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.contains(34));
        // q.clear();

        System.out.println(q);
    }
}

class mapex {
    mapex() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aaryan", 123);
        map.put("Arush", 12);
        map.put("Rohit", 34);

        System.out.println(map.get("Aaryan"));
        map.keySet().forEach(key -> System.out.println(key));
        map.values().forEach(val -> System.out.println(val));

        map.remove("Rohit");
        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}

class setex {
    setex() {
        Set<Integer> set = new HashSet<>();

        set.add(34);
        set.add(45);
        set.add(45);
        set.remove(45);

        set.clear();
        System.out.println(set.isEmpty());
        set.forEach(System.out::println);
    }
}



public class ds {
    public static void main(String[] args) {
        // stackex s = new stackex();
        // queueex q = new queueex();
        // mapex m = new mapex();
        // setex set = new setex();
    }
}
