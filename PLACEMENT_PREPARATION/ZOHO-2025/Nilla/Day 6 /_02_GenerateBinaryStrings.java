public class GenerateBinaryStrings {
    
    public static void generate(char[] str, int index) {
        if (index == str.length) {
            System.out.println(new String(str));
            return;
        }
        if (str[index] == '?') {
            str[index] = '0';
            generate(str, index + 1);
            str[index] = '1';
            generate(str, index + 1);
            str[index] = '?';
        } else {
            generate(str, index + 1);
        }
    }

    public static void main(String[] args) {
        String input = "1??0?101";
        char[] pattern = input.toCharArray();
        generate(pattern, 0);
    }
}
