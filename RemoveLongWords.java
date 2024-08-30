import java.util.Scanner; // Імпорт класу Scanner для введення користувача

public class RemoveLongWords {

    public static void main(String[] args) {
        // Створення об'єкта Scanner для читання вводу користувача
        Scanner scanner = new Scanner(System.in);

        // Запитуємо користувача ввести текст
        System.out.println("Введіть текст:");
        String input = scanner.nextLine();

        // Викликаємо метод для видалення слів довжиною 5 і більше символів
        String result = removeLongWords(input);

        // Виведення результату
        System.out.println("Текст після видалення слів довжиною 5 і більше символів:");
        System.out.println(result);

        // Закриття сканера
        scanner.close();
    }

    // Метод, що видаляє слова довжиною 5 і більше символів
    public static String removeLongWords(String text) {
        // Розбиття введеного тексту на масив слів, використовуючи пробіл як роздільник
        String[] words = text.split(" ");

        // Використання StringBuilder для збору слів, що залишились
        StringBuilder result = new StringBuilder();

        // Перебір кожного слова в масиві
        for (String word : words) {
            // Якщо слово менше ніж 5 символів, додаємо його до результату
            if (word.length() < 5) {
                // Додаємо слово та пробіл до StringBuilder
                result.append(word).append(" ");
            }
        }

        // Перетворення StringBuilder в строку та видалення останнього пробілу
        return result.toString().trim();
    }
}
