

import java.util.Random;
import java.util.Scanner;

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
}

    //6 Words

    class Words {
        // є масив
        static String[] words = {"apple", "orange",
                "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        //  викидуємо випадкове число 0-24
        static Random random = new Random();

        //загадуємо слово із випадкового числа, перетворюємо із випадкового
        static String word = words[random.nextInt(25)];

        public static void main(String[] args) {

                //слово можливо відгадати частинами, зараз воно виглядає так
                String answer = "###############";

                //перетворюємо слова загадане і яке буде відображатися по частинах умасив чарів
                char[] answerArray = answer.toCharArray();
                char[] wordArray = word.toCharArray();

                //є потреба зробити нескінченний цикл для роботи програми
                Scanner scanner = new Scanner(System.in);
                while (true) {

                //робимо відповідь у вигляді вводу в консоль тексту користувачем
                System.out.println("Будь ласка, вгадайте загадане слово серед овочів");
                String userLine = scanner.nextLine();
                userLine += "###############";
                char[] userLineArray = userLine.toCharArray();

                //якщо ми вгадали загадане слово то треба про це повідомити користувача
                //------------------------------------
                // не зрозумілий ефект
                if (userLine.equals(word)) {
                    System.out.println("Ви відгадали відразу");
                    break;
                }


                // порівнюємо літери і шукаємо однакові

                for (int i = 0; i < wordArray.length; i++) {

                    if (wordArray[i] == userLineArray[i]) {
                        answerArray[i] = wordArray[i];
                    }
                }
                answer = new String(answerArray);

                // Перевірка, чи відгадане вже слово по буквах
                if (answer.contains(word)) {
                    System.out.println("Ви відгадали по буквах");
                    break;
                }

                System.out.println("Ви не вгадали, слово виглядає як " + answer);
            }

            System.out.println("Cлово було " + word);
        }
    }