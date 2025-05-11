class Solution {
    public static int totalElements(Integer[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        int maxLen = 0;
        int start = 0;
        int[] freq = new int[100001]; // Since arr[i] <= 10^5
        int distinct = 0;
        for (int end = 0; end < n; end++) {
            if (freq[arr[end]] == 0) {
                distinct++;
            }
            freq[arr[end]]++;

            while (distinct > 2) {
                freq[arr[start]]--;
                if (freq[arr[start]] == 0) {
                    distinct--;
                }
                start++;
            }
            int len = end - start + 1;
            if (len > maxLen) {
                maxLen = len;
            }
        }
        return maxLen;
    }
}
