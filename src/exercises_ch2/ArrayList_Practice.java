package exercises_ch2;
import java.util.ArrayList;
public class ArrayList_Practice {
    public static int sumOfEven () {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);
        numberList.add(10);
        int total = 0;
        for (int i : numberList) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }
    public static void main(String[] args) {


        System.out.println(sumOfEven());

    }
}

