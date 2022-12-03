package hillel.hw7;

import java.util.Random;
import java.util.Scanner;

public class Unit6 {
    private static String[] words = {"apple", "orange",
            "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper",
            "pineapple", "pumpkin", "potato"};

    private static Random random = new Random();
    private static String word = words[random.nextInt(25)];
    private static String answer = "###############";

    public static void wordStartGame() {

        char[] answerArray = answer.toCharArray();
        char[] wordArray = word.toCharArray();
        wordDoCalc(wordArray, answerArray);
        System.out.println("Загадано було " + word);
    }


    public static void wordDoCalc(char[] wordArray, char[] answerArray) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Будь ласка, вгадайте загадане слово");
            String userLine = scanner.nextLine();

            if (userLine.equals(word)) {
                System.out.println("Ви відгадали");
                break;
            }

            userLine = userLine.toLowerCase() + "###############";
            char[] userLineArray = userLine.toCharArray();

            for (int i = 0; i < wordArray.length; i++) {
                if (wordArray[i] == userLineArray[i]) {
                    answerArray[i] = wordArray[i];
                }
            }
            answer = new String(answerArray);

            if (answer.contains(word)) {
                System.out.println("Ви відгадали по буквах");
                break;
            }

            System.out.println("Ви не відгадали, слово виглядає як " + answer);
        }

    }
}
