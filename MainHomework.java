import strings.StringHomeWork;
import words.WordHomeWork;

public class MainHomework {

    public static void main(String[] args) {
        System.out.println(StringHomeWork.findSymbolOccurance("Hellolllo", 'l'));
        System.out.println(StringHomeWork.findWordPosition("ooHelloHello", "З"));
        System.out.println(StringHomeWork.stringReverse("privet"));
        System.out.println(StringHomeWork.isPalindrome("ololop"));

        WordHomeWork.wordGame();
    }
}