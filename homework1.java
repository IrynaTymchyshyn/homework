// Примітивні типи
//1.Створити примітивні типи
byte byteVar = 10;
short shortVar = 1000;
int intVar = 1000000;
long longVar = 1000000000L;
float floatVar = 3.14f;
double doubleVar = 2.71828;
char charVar = 'A';
boolean booleanVar = true; // булевий тип, але в цьому завданні напевне його не потрібно

//Завдання 2. Обчислення суми значень кожного типу
int sumInt = intVar + shortVar + byteVar;
long sumLong = longVar + intVar + shortVar + byteVar;
float sumFloat = floatVar + intVar + shortVar + byteVar;
double sumDouble = doubleVar + floatVar + intVar + shortVar + byteVar;
char sumChar = (char) (charVar + intVar)

//3.Просумувати результат в змінну long result та результат вивести в консоль.
//Збираю всі суми в змінну типу long і виводжу її у консоль:

long result = sumByte + sumShort + sumInt + sumLong + (long) sumFloat + (long) sumDouble + sumChar;
System.out.
void println("Результат сумування: " + result);

//4. Реалізувати метод конвертації градусів Фарангейта в градуси Цельсії
//public static double convertToCelsius(double degreeFahrenheit) { return ...;

public static double convertToCelsius(double degreeFahrenheit) {
    return (degreeFahrenheit - 32) * 5 / 9;
}

//5. Метод конвертації дюймів у сантиметри
public static double convertToCentimeters(double inches) {
    return inches * 2.54;
}


