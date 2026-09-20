// input1[] = { 2, 2, 4, 5 } => return 19 = 2+3+4+5 (all elements are unique, so just add them up)
// input2[] = { 1, 2, 2 } => return 6 = 1+2+3 (index 2 is duplicate, so increment it)
// input3[] = { 2, 2, 4, 5 } => return 14 = 2+3+4+5 (index 1 is duplicate, so increment it)

public class UniqueSum {
    public static int minSumUnique(int[] arr) {
        int sum = 0;
        int prev = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > prev) {
                sum += num;
                prev = num;
            } else {
                prev += 1;
                sum += prev;
            }
        }
        return sum;
}
}
