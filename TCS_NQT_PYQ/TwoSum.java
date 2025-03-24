public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>hs=new HashMap<>();
        int n=nums.length;

        for(int i=0;i<n;i++) {
            hs.put(nums[i],i);
        }

        for(int i=0;i<n;i++) {
            int comp=target-nums[i];
            if(hs.containsKey(comp) && hs.get(comp) !=i) {
                return new int[] {i,hs.get(comp)};
            }
        }
        return new int[]{};
    }
}