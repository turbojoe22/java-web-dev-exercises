package exercises_ch2;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] intArray = {1,1,2,3,5,8};
        for (int i : intArray){
            if(i %2 != 0){
                System.out.println(i);
            }
        }
        String sentence = " I would not, could not, in a box. I would not, could not with a fox." +
                " I will not eat them in a house. I will not eat them with a mouse.";
        //String[] splitWords = sentence.split(" ");
        //System.out.println(Arrays.toString(splitWords));
        String[] splitSentence = sentence.split("\\.");
        System.out.println(Arrays.toString(splitSentence));
    }

}
