public class SmallestLargest {

    public static void findSmallestAndLargestWord(String input) {
        int n = input.length();
        String smallest = "";
        String largest = "";
        String currentWord = "";
        int i = 0;
      
        while (i <= n) {
            char ch;
              if (i < n)
                  ch = input.charAt(i);
              else
                  ch = ' '; 

            if (ch != ' ') {
                currentWord += ch;
            } else {
                if (!currentWord.equals("")) {
                    int currLen = 0;
                    for (int j = 0; j < currentWord.length(); j++) {
                        currLen++;
                    }
                    int smallLen = 0, largeLen = 0;
                    for (int j = 0; j < smallest.length(); j++) smallLen++;
                    for (int j = 0; j < largest.length(); j++) largeLen++;

                    if (smallest.equals("") || currLen < smallLen) {
                        smallest = currentWord;
                    }
                    if (largest.equals("") || currLen > largeLen) {
                        largest = currentWord;
                    }
                    currentWord = ""; 
                }
            }
            i++;
        }

        System.out.println("Smallest word: " + smallest);
        System.out.println("Largest word: " + largest);
    }

    public static void main(String[] args) {
        String input = "Java is a powerful programming language";
        findSmallestAndLargestWord(input);
    }
}
