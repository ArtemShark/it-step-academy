import java.util.Scanner;

public class Exercise11 {
    public static void drawLine(int length, String direction, char symbol) {
        if (length <= 0) {
            System.out.println("Длина линии должна быть положительным числом");
            return;
        }

        if (direction.equalsIgnoreCase("горизонтальная")) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        else if (direction.equalsIgnoreCase("вертикальная")) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Направление может быть только 'вертикальная' или 'горизонтальная' ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длинну линии: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите направление (горизонтальная/вертикальная): ");
        String direction = scanner.nextLine();

        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);

        drawLine(length, direction, symbol);
    }
}
