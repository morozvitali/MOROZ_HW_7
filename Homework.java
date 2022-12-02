import java.util.Random;
import java.util.Scanner;

class Homework {
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


    // 6 гра words
    static String[] words = {"apple", "orange",
            "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper",
            "pineapple", "pumpkin", "potato"};


    static Random random = new Random(); //викидуємо випадкове число 0-24


    static String word = words[random.nextInt(25)]; //загадуємо слово із випадкового числа, перетворюємо із випадкового

    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Hellolllo", 'l'));
        System.out.println(findWordPosition("ooHelloHello", "З"));
        System.out.println(stringReverse("privet"));
        System.out.println(isPalindrome("ololop"));


        String answer = "###############"; //слово можливо відгадати частинами, зараз воно виглядає так


        char[] answerArray = answer.toCharArray(); //перетворюємо слова загадане і яке буде по частинах у масив чарів
        char[] wordArray = word.toCharArray();


        Scanner scanner = new Scanner(System.in); //є потреба зробити нескінченний цикл для роботи програми
        while (true) {

            System.out.println("Будь ласка, вгадайте загадане слово серед овочів");
            String userLine = scanner.nextLine();
            userLine += "###############";
            char[] userLineArray = userLine.toCharArray();

            if (userLine.equals(word)) { //якщо ми відгадали слово треба про це повідомити користувача
                System.out.println("Ви відгадали відразу");
                break;
            }

            for (int i = 0; i < wordArray.length; i++) { // порівнюємо літери шукаємо однакові
                if (wordArray[i] == userLineArray[i]) {
                    answerArray[i] = wordArray[i];
                }
            }
            answer = new String(answerArray);

            if (answer.contains(word)) { // Перевірка, чи відгадане вже слово по буквах
                System.out.println("Ви відгадали по буквах");
                break;
            }
            System.out.println("Ви не відгадали, слово виглядає як " + answer);
        }
        System.out.println("Cлово було " + word);
    }
}