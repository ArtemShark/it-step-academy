import java.util.Arrays;
import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for(int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        System.out.print("Выберите направление сортировки (1 - по возрастанию, 2 - по убыванию): ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            sortAscending(array);
            System.out.println("Отсортированный массив по возрастанию: " + Arrays.toString(array));
        }
        else if (choice == 2) {
            sortDescending(array);
            System.out.println("Отсортированный массив по убыванию: " + Arrays.toString(array));
        } else {
            System.out.println("Ошибка, выберите корректное направление сортировки");
        }
    }

    public static void sortAscending(int[] array) {
        Arrays.sort(array);
    }

    public static void sortDescending(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
