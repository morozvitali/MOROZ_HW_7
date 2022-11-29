import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {

        System.out.println(findSymbolOccurance("Hellolllo", 'l'));
        System.out.println(findWordPosition("ooHelloHello", "З"));
        System.out.println(stringReverse("privet"));
        System.out.println(isPalindrome("ololop"));

    }


    // 2. findSymbolOccurance
    public static int findSymbolOccurance(String s, char c) {
        int value = 0;
        char[] charArray = s.toCharArray();
        for (char nextChar : charArray) {
            if (nextChar == c) value++;
        }
        return value;
    }


    //3. findWordPosition
    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    //4. stringReverse
    public static String stringReverse(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = s.charAt(i) + result;
        }
        return result;
    }


    //5. isPalindrome
    public static boolean isPalindrome(String s) {

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - 1 - i])
                return false;
        }
        return true;
    }


    //6. * Створити масив зі слів String[] words = {"apple", "orange",
    // "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot",
    // "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
    // "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper",
    // "pineapple", "pumpkin", "potato"};

    // При запуску програми комп'ютер загадує слово, запитує відповідь у користувача,
    // порівнює його із загаданим словом та повідомляє чи правильно відповів користувач.
    // Якщо слово не вгадано, комп'ютер показує літери, які стоять на своїх місцях.

    // apple – загадане
    // apricot - відповідь гравця
    // ap############# (15 символів, щоб користувач не міг дізнатися довжину слова)

    // Для порівняння двох слів посимвольно, можна скористатися:
    // String str = "apple";
    // str.charAt(0); - метод, поверне char, який стоїть у слові str на першій позиції
    // Граємо до тих пір, поки гравець не відгадає слово
    // Використовуємо лише маленькі літери

    // ВАЖЛИВО: Під час роботи із завданням використовувати класи: - java.util.Scanner для введення інформації через консоль
    // https: //docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html
    //  - java.util.Random для генерації випадкових чисел (індексів)
    // https://docs. oracle.com/en/java/javase/17/docs/api/java.base/java/util/Random.html

}


