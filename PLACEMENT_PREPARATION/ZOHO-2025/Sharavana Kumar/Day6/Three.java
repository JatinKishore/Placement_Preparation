import java.math.BigInteger;
import java.util.List;

public class AddBinaryStrings {
    public static String addBinary(List<String> binaries) {
        BigInteger sum = BigInteger.ZERO;
        for (String bin : binaries) {
            sum = sum.add(new BigInteger(bin, 2));
        }
        return sum.toString(2);
    }
}
