package java03;

@FunctionalInterface
interface in {
    void fly();
    // void got();
}

class inex implements in {

    @Override
    public void fly() {
        System.out.println("flying");
    }

}

public class lambda {
    public static void main(String[] args) {
        in obj = new inex();
        in obj1 = new in() {

            @Override
            public void fly() {
                System.out.println("Flying from anonymous");
            }
            
        };
        in obj3 = () -> System.out.println("Flying from lambda"); 
        obj.fly();
        obj1.fly();
        obj3.fly();
    }
}
