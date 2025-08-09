public class SecondMostRepeated {

    public static String findSecondMostRepeated(String[] arr) {
        int n = arr.length;
        String[] words = new String[n];   
        int[] freq = new int[n];         
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            String word = arr[i];
            int found = -1;
            for (int j = 0; j < uniqueCount; j++) {
                if (words[j].equals(word)) {
                    found = j;
                    break;
                }
            }

            if (found != -1) {
                freq[found]++;
            } else {
                words[uniqueCount] = word;
                freq[uniqueCount] = 1;
                uniqueCount++;
            }
        }
      
        int fMax = 0, sMax = -1;

        for (int i = 1; i < uniqueCount; i++) {
            if (freq[i] > freq[fMax]) {
                sMax = fMax;
                fMax = i;
            } else if (sMax == -1 || freq[i] > freq[sMax]) {
                sMax = i;
            }
        }

        return words[sMax];
    }

    public static void main(String[] args) {
        String[] input = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
        System.out.println(findSecondMostRepeated(input)); 
    }
}
