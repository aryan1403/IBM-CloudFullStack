package java03;

enum Day {
    Monday,
    Tuesday,
    Wednesday
}

public class e {

    public static void printDay(Day day) {

        switch(day) {
            case Monday:
                System.out.println("You selected option 1.");
                break;
            case Tuesday:
                System.out.println("You selected option 2.");
                break;
            case Wednesday:
                System.out.println("You selected option 3.");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
    
    public static void main(String[] args) {
        String[] arr = {
            "Monday",
            "Tuesday",
            "Wednesday"
        };

        String choice = arr[1]; 


        switch(choice) {
            case "Monday":
                System.out.println("You selected option 1.");
                break;
            case "Tuesday":
                System.out.println("You selected option 2.");
                break;
            case "Wednesday":
                System.out.println("You selected option 3.");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
