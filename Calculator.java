import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        while (true){
            System.out.println("Виберіть пункт");
            System.out.println("1.Додавання");
            System.out.println("2.Віднімання");
            System.out.println("3.Множення");
            System.out.println("4.Ділення");
            System.out.println("5.Вийти");
            int person = scaner.nextInt();
            int result;
            if (person == 5){
                break;
            } else if (person == 1){
                System.out.println("Ведіть перше число : ");
                int a = scaner.nextInt();
                System.out.println("Веддіть друге число :");
                int b = scaner.nextInt();
                System.out.println("a : " + a);
                System.out.println("b : " + b);
                result = a + b;
                System.out.println("Відповідь : " + result);
            }else if (person == 2){
                System.out.println("Ведіть перше число : ");
                int a = scaner.nextInt();
                System.out.println("Веддіть друге число :");
                int b = scaner.nextInt();
                System.out.println("a : " + a);
                System.out.println("b : " + b);
                result = a - b;
                System.out.println("Відповідь : " + result);
            }else if (person == 3){
                System.out.println("Ведіть перше число : ");
                int a = scaner.nextInt();
                System.out.println("Веддіть друге число :");
                int b = scaner.nextInt();
                System.out.println("a : " + a);
                System.out.println("b : " + b);
                result = a * b;
                System.out.println("Відповідь : " + result);
            }else if (person == 1){
                System.out.println("Ведіть перше число : ");
                int a = scaner.nextInt();
                System.out.println("Веддіть друге число :");
                int b = scaner.nextInt();
                System.out.println("a : " + a);
                System.out.println("b : " + b);
                result = a + b;
                System.out.println("Відповідь : " + result);
            }else if (person == 4){
                System.out.println("Ведіть перше число : ");
                int a = scaner.nextInt();
                System.out.println("Веддіть друге число :");
                int b = scaner.nextInt();
                if (b == 0){
                    System.out.println("На нуль ділити не можна");
                }
                System.out.println("a : " + a);
                System.out.println("b : " + b);
                result = a / b;
                System.out.println("Відповідь : " + result);
            } else {
                System.out.println("Помилка/Error");
            }
        }
        System.out.println("Програма завершена");
    }
}
