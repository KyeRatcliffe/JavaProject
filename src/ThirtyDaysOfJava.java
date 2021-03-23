import java.util.Scanner;

public class ThirtyDaysOfJava {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input your name");
        String name = userInput.nextLine();

        System.out.println("Thank you: " + name);
        System.out.println("Hi");
    }

}
