class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        int maxSeq = 0;

        for(int n : nums){
            if(!set.contains(n-1)){
                int temp = n;
                int seq = 1;
                while(seq < nums.length){
                    if(set.contains(temp+1)){
                        seq++;
                        temp++;
                    }
                    else{
                        break;
                    }
                }
                maxSeq = Math.max(seq, maxSeq);
            }
        }
        return maxSeq;
    }
}
