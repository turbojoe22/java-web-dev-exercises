package exercises_ch1;
import java.util.Scanner;
public class numericTypes {
    public static void main(String[] args) {
        Scanner lengthInput = new Scanner(System.in);
        System.out.println("Enter the rectangle height: ");
        int lengthInt = lengthInput.nextInt();
        Scanner heightInput = new Scanner(System.in);
        System.out.println("Enter the rectangle width: ");
        int widthInt = heightInput.nextInt();
        int areaInt = widthInt * lengthInt;
        System.out.println("The area of your rectangle is " + areaInt);
    }
}
