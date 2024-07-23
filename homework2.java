import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення двох чисел
        System.out.print("20");
        double num1 = scanner.nextDouble();

        System.out.print("10");
        double num2 = scanner.nextDouble();

        // Додавання
        double sum = num1 + num2;
        System.out.println("Сума: " + sum);

        // Віднімання
        double difference = num1 - num2;
        System.out.println("Різниця: " + difference);

        // Множення
        double product = num1 * num2;
        System.out.println("Добуток: " + product);

        // Ділення
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Частка: " + quotient);

            // Залишок від ділення
            double remainder = num1 % num2;
            System.out.println("Залишок від ділення: " + remainder);
        } else {
            System.out.println("Ділення на нуль не дозволено.");
        }

        scanner.close();
    }
}
