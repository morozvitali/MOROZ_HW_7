package words;

import java.util.Random;
import java.util.Scanner;

public class WordHomeWork {
    private static String[] words = {"apple", "orange",
            "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper",
            "pineapple", "pumpkin", "potato"};


    private static Random random = new Random();
    private static String word = words[random.nextInt(25)];

    public static void wordGame() {

        String answer = "###############";
        char[] answerArray = answer.toCharArray();
        char[] wordArray = word.toCharArray();

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
        System.out.println("Загадано було " + word);
    }
}
