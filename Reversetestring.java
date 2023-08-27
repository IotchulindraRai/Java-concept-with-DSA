public class Reverse {
    public static String reverseWord(String str) {
        char[] charArray = str.toCharArray(); // Convert string to char array
        int i = 0, j = charArray.length - 1;
        
        while (i < j) {
            // Swap characters using a temporary variable
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            
            ++i;
            --j;
        }

        return new String(charArray); // Convert char array back to string
    }
}
