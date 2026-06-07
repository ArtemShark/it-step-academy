import java.util.Arrays;
import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        int arraySize = 15;

        int[] originalArray = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            originalArray[i] = random.nextInt(21) - 10;
        }

        System.out.println("Исходный массив: " + Arrays.toString(originalArray));

        int[] evenNumbers = new int[arraySize];
        int evenCount = 0;

        int[] oddNumbers = new int[arraySize];
        int oddCount = 0;

        int[] negativeNumbers = new int[arraySize];
        int negativeCount = 0;

        int[] positiveNumbers = new int[arraySize];
        int positiveCount = 0;

        for (int i = 0; i < arraySize; i++) {
            int current = originalArray[i];

            if (current % 2 == 0) {
                evenNumbers[evenCount++] = current;
            } else {
                oddNumbers[oddCount++] = current;
            }

            if (current < 0) {
                negativeNumbers[negativeCount++] = current;
            }
            else if (current > 0) {
                positiveNumbers[positiveCount++] = current;
            }
        }

        int[] evenArray = Arrays.copyOf(evenNumbers, evenCount);
        int[] oddArray = Arrays.copyOf(oddNumbers, oddCount);
        int[] negativeArray = Arrays.copyOf(negativeNumbers, negativeCount);
        int[] positiveArray = Arrays.copyOf(positiveNumbers, positiveCount);

        System.out.println("Четные числа: " + Arrays.toString(evenArray));
        System.out.println("Нечетные числа: " + Arrays.toString(oddArray));
        System.out.println("Отрицательные числа: " + Arrays.toString(negativeArray));
        System.out.println("Положительные числа: " + Arrays.toString(positiveArray));
    }
}
