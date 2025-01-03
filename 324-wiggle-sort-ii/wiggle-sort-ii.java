class Solution 
{
    public void wiggleSort(int[] nums) 
    {
    
        /*for(int i=1;i<nums.length;i++)
        {
            if(i%2==1)
            {
                if(nums[i-1]<nums[i])
                {
                    continue;
                }
                else
                {
                    int j=i+1;
                    while(nums[i-1]>nums[j] && j < nums.length)
                    {
                        j++;
                    }
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    continue;
                }
                
            }
            else
            {
                if(nums[i-1]>nums[i])
                {
                    continue;
                }
                else
                {
                    int j=i+1;
                    while(nums[i-1]<nums[j] && j<nums.length)
                    {
                        j++;
                    }
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                    continue;
                }
            }*/
            int n=nums.length-1;
            int[] newarr=Arrays.copyOf(nums,nums.length);
            Arrays.sort(newarr);
            for(int i=1;i<nums.length;i+=2)
            nums[i]=newarr[n--];
            for(int i=0;i<nums.length;i+=2)
            nums[i]=newarr[n--];
        
    }
}