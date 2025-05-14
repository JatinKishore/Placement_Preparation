public class StringPermutations {
    public static void permute(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            permute(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i));
        }
    }

    public static void generate(String input) {
        if (input.length() <= 5) {
            permute(input, "");
        } else {
            System.out.println("Input length exceeds 5.");
        }
    }
}
