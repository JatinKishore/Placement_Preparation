public class SpaceInsertion {
    public static void generateSpaces(String input, String output, int index) {
        if (index == input.length()) {
            System.out.println(output);
            return;
        }
        generateSpaces(input, output + input.charAt(index), index + 1);
        if (index < input.length()) {
            generateSpaces(input, output + " " + input.charAt(index), index + 1);
        }
    }
  
    public static void printAllCombinations(String str) {
        if (str.length() == 0) return;
        String output = "" + str.charAt(0);  
        generateSpaces(str, output, 1);
    }
  
    public static void main(String[] args) {
        String str = "ABC";
        printAllCombinations(str);
    }
}
