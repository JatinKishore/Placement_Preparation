public class BinaryStringGenerator {

    public static void generate(String pattern) {
        char[] arr = pattern.toCharArray();
        generateHelper(arr, 0);
    }

    private static void generateHelper(char[] arr, int index) {
        if (index == arr.length) {
            System.out.println(new String(arr));
            return;
        }

        if (arr[index] == '?') {
            arr[index] = '0';
            generateHelper(arr, index + 1);
            arr[index] = '1';
            generateHelper(arr, index + 1);
            arr[index] = '?';
        } else {
            generateHelper(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        String pattern = "1?0?";
        System.out.println("Binary strings from pattern \"" + pattern + "\":");
        generate(pattern);
    }
}
