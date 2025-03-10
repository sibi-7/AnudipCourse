import java.util.*;

public class SumEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of Even Numbers: " + sum);
    }
}
