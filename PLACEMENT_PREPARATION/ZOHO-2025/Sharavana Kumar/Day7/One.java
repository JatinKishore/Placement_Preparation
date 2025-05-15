class Solution {
    public String largestNumber(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            String str1 = Integer.toString(a);
            String str2 = Integer.toString(b);
            String str12 = str1 + str2;
            String str21 = str2 + str1;
            return str21.compareTo(str12);  
        });

        for (int num : nums) {
            pq.add(num);
        }

        StringBuilder sc = new StringBuilder();
        while (!pq.isEmpty()) {
            sc.append(pq.poll());
        }
        if (sc.charAt(0) == '0') return "0";
        return sc.toString();
    }
}
