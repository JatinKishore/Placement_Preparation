public class EqualCharacterPairs {

    public static int countEqualPairs(String str) {
        int[] arr = new int[256]; 
      
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        int tPairs = 0;
        for (int i = 0; i < 256; i++) {
            if (arr[i] > 0) {
                tPairs += arr[i] * arr[i];
            }
        }

        return tPairs;
    }

    public static void main(String[] args) {
        String input = "geeksforgeeks";
        System.out.println(countEqualPairs(input));  
    }
}
