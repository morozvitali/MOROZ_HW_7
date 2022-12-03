package src.main.java.hillel.hw7;

public class Unit5 {

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
