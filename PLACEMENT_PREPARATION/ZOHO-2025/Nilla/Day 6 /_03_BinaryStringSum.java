public class BinaryStringSum {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int bitA = (i >= 0) ? (a.charAt(i) - '0') : 0;
            int bitB = (j >= 0) ? (b.charAt(j) - '0') : 0;

            int sum = bitA + bitB + carry;
            result.append(sum % 2);  
            carry = sum / 2;       
          
            i--;
            j--;
        }

        return result.reverse().toString();
    }

    public static String sumBinaryArray(String[] arr) {
        String sum = "0";
        for (String binary : arr) {
            sum = addBinary(sum, binary); 
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] arr = {"1101", "111"};
        System.out.println(sumBinaryArray(arr));  
    }
}
