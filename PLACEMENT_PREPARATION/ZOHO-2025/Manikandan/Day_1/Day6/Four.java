import java.util.*;

public class ReplaceDuplicates {
    public int[] replaceDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        int next = 1;

        for (int i = 0; i < arr.length; i++) {
            while (seen.contains(arr[i])) {
                while (seen.contains(next)) {
                    next++;
                }
                arr[i] = next;
                next++;
            }
            seen.add(arr[i]);
        }

        return arr;
    }
}
