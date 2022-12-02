package strings;

public class StringHomeWork {
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
