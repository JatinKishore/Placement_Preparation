public class SmallestLargestWord {
    public static void findWords(String sentence) {
        String[] words = sentence.split("\\s+");
        String smallest = words[0], largest = words[0];

        for (String word : words) {
            if (word.length() < smallest.length()) smallest = word;
            if (word.length() > largest.length()) largest = word;
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
