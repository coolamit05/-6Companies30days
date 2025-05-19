class Solution {
    public String triangleType(int[] nums) {
        int n=nums.length;
        int k=0;
        if((nums[0]+nums[1]>nums[2]) && (nums[0]+nums[2]>nums[1]) && (nums[1]+nums[0]>nums[2]) &&(nums[1]+nums[2]>nums[0]) && (nums[2]+nums[0]>nums[1]) && (nums[2]+nums[1]>nums[0]))
        {
            k=1;
        }
        if(k==0)
        {
            return "none";
        }
        if(nums[0]==nums[1] && nums[1]==nums[2])
        {
            return "equilateral";
        }
        else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[2]==nums[0])
        {
            return "isosceles";
        }
        else
        {
            return "scalene";
        }
        
        
    }
}