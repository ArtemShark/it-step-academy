import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество метров: ");
        double meters = scanner.nextDouble();

        System.out.println("Выберите в какие единицы измерения перевести: ");
        System.out.println("1. Мили");
        System.out.println("2. Дюймы");
        System.out.println("3. Ярды");
        System.out.println("Введите номер выбора (1/2/3): ");
        int choice = scanner.nextInt();

        double result;

        switch(choice) {
            case 1:
                result = meters * 0.000621371;
                System.out.println("Результат: " + result + " миль");
                break;
            case 2:
                result = meters * 39.3701;
                System.out.println("Результат: " + result + " дюймов");
                break;
            case 3:
                result = meters * 1.09361;
                System.out.println("Результат: " + result + " ярд");
                break;
            default:
                System.out.println("Ошибка, введите корректный номер выбора (1/2/3)");
        }
    }
}
