class Solution 
{
    public int longestMonotonicSubarray(int[] nums) 
    {
        if(nums.length==1)
        {
            return 1;
        }
        int max1=0,max2=0;
        //Strictly increasing
        for(int i=0;i<nums.length-1;i++)
        {
            int count=1;
            for(int j=i;j<nums.length-1;j++)
            {
                if(nums[j]<nums[j+1])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            max1=Math.max(count,max1);
        }
        //Strictly decreasing
        for(int i=0;i<nums.length-1;i++)
        {
            int count=1;
            for(int j=i;j<nums.length-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            max2=Math.max(count,max2);
        }
        return Math.max(max1,max2);
        
    }
}