public class DivideLargeNumber {

    public static String divideLargeNumber(String number, int divisor) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        int temp = number.charAt(index) - '0';
        while (temp < divisor && index < number.length() - 1) {
            index++;
            temp = temp * 10 + (number.charAt(index) - '0');
        }
        if (temp < divisor) {
            return "0";
        }
        while (number.length() > index) {
            result.append(temp / divisor);
            index++;
            if (index < number.length()) {
                temp = (temp % divisor) * 10 + (number.charAt(index) - '0');
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String number = "1260257";
        int divisor = 37;
        System.out.println(divideLargeNumber(number, divisor)); 
    }
}
