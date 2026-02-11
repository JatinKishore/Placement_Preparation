public class DivideLargeNumber {
    public static String divide(String number, int divisor) {
        StringBuilder result = new StringBuilder();
        int idx = 0;
        int temp = number.charAt(idx) - '0';
        while (temp < divisor && idx < number.length() - 1) {
            temp = temp * 10 + (number.charAt(++idx) - '0');
        }

        while (number.length() > idx) {
            result.append(temp / divisor);
            idx++;
            if (idx < number.length()) {
                temp = (temp % divisor) * 10 + number.charAt(idx) - '0';
            }
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
