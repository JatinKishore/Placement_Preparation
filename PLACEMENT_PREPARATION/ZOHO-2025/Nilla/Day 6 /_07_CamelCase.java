public class CamelCaseConverter {

    public static String toCamelCase(String sentence) {
        String res = "";
        boolean capitalizeNext = false;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch == ' ') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    if (ch >= 'a' && ch <= 'z') {
                        ch = (char)(ch - 'a' + 'A');
                    }
                    capitalizeNext = false;
                }
                res += ch;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String input = "i got intern at geeksforgeeks";
        System.out.println(toCamelCase(input)); 
    }
}
