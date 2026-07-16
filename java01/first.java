package java01;

public class first {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String name = "Aryan";
        // String name2 = new String("Aryan");

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.substring(0, 3));
        // System.out.println(name.equals(name2));

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        if(a > b) {
            System.out.println("a is greater than b");
        } else if(a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is equal to b");
        }

        System.out.print("Hello World");
        System.out.println("hello aryan");
    }
}
