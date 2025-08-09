public class StringPermutations {
    public static void permute(String str, String chosen) {
        if (str.length() == 0) {
            System.out.println(chosen);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                String rest = str.substring(0, i) + str.substring(i + 1);
                permute(rest, chosen + c);
            }
        }
    }
    public static void main(String[] args) {
        String input = "ABC"; 
        permute(input, "");
    }
}
