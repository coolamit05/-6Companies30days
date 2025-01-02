class Solution {
    public int numberOfSubarrays(int[] nums, int k) 
    {
        return helper(nums, k)-helper(nums, k-1);
    }
    public static int helper(int[] nums, int k)
    {
        int count = 0;
        int l = 0;
        int r = 0;
        int ans =0;
        while(r < nums.length)
        {
            if(nums[r]%2!=0) // odd ko add kro
                count++;

            while(l<=r && count>k){
                if(nums[l]%2!=0) count--;
                l++;
            }
            ans+=(r-l+1);
            r++;
        }

        return ans;
    }
}