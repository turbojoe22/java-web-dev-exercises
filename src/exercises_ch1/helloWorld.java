package exercises_ch1;
import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        input.close();
    }

}
