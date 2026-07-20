package java03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

public class arr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = -2;
        arr[3] = 13;
        arr[4] = 31;

        // Arrays.sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println(arr.toString());

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate today = LocalDate.now(); 
        
        LocalDate futureDate = today.plusDays(5); 
        futureDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.println(futureDate);

        Integer a = new Integer(5);
        a = 6;
        System.out.println(a);

        // unboxing
        Integer b = new Integer(10);
        int c = b.intValue();

        System.out.println(c);

        try {

            int d = 3 / 0;
            System.out.println(d);
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        
    }
}

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

}


class A {
    int a = 5;
}


class B extends A {
    int a = 3;
    B() {
        A a = new B();
        a.a = this.a;
    }
}