public class SpacePermutations {
    public static void generate(String input, String output, int index) {
        if (index == input.length()) {
            System.out.println(output);
            return;
        }

        generate(input, output + " " + input.charAt(index), index + 1);
        generate(input, output + input.charAt(index), index + 1);
    }

    public static void generateAll(String input) {
        if (input.length() > 0)
            generate(input, "" + input.charAt(0), 1);
    }
}
