import java.util.Arrays;
import java.util.Random;

public class Exercise9 {
    public static void main(String[] args) {
        int arraySize = 15;

        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        System.out.println(Arrays.toString(array));

        System.out.println();

        int min = array[0];
        int max = array[0];
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arraySize; i++) {
            int current = array[i];
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
            if (current < 0) {
                negativeCount++;
            }
            else if (current > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Количество отрицательных элементов: " + negativeCount);
        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество нулей: " + zeroCount);
    }
}
