package M_1_Arrays;

import java.util.Arrays;

public class ArrayImpl {

    int[] numbers = new int[3];

    public void printArray() {
        //System.out.println(numbers);
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        //numbers[3] = 40;
        System.out.println(Arrays.toString(numbers));
    }
}
