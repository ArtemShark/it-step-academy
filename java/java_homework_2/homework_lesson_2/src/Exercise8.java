import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начало диапазона: ");
        int start = scanner.nextInt();

        System.out.println("Введите конец диапазона: ");
        int end = scanner.nextInt();

        if (start > end) {
            System.out.println("Ошибка, начало диапазона должно быть меньше или равно концу диапазона");
        } else {
            for (int i = start; i <= end; i++){
                for (int j = 1; j <= 10; j++){
                    System.out.print(i + " * " + j + " = " + (i * j) + "\t");
                }
                System.out.println();
            }
        }
    }
}
