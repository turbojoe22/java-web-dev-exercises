package exercises_ch1;
import java.util.Scanner;
public class numericTypesMPG {
    public static void main(String[] args) {
        Scanner milesDrivenInput = new Scanner(System.in);
        System.out.println("Enter the amount of miles driven: ");
        float milesDriven = milesDrivenInput.nextFloat();
        Scanner gallonsGasConsumed = new Scanner(System.in);
        System.out.println("Enter gallons of gas burned: ");
        float gasBurned = gallonsGasConsumed.nextFloat();
        float mpg = milesDriven/gasBurned;
        System.out.println("The miles-per-gallon is " + mpg);
    }
}
