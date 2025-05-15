class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int candy = n/2;
        HashSet<Integer>hs = new HashSet<>();
        for(int i : candyType){
            hs.add(i);
        }
        return hs.size()>candy ? candy : hs.size();
    }
}
