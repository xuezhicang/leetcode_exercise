class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        int res;
        int high;
        int low = Integer.MAX_VALUE;
            
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]%2 == 1)
            {
                pq.add(nums[i]*2);
                low = Math.min(nums[i]*2,low);  
            }     
            else
            {
                pq.add(nums[i]);
                low = Math.min(nums[i],low);
            }              
        }
        res = pq.peek() - low; 
        while(pq.peek()%2 == 0)
        {
            int temp = pq.poll()/2;
            low = Math.min(temp,low);
            pq.add(temp);
            res = Math.min(res,pq.peek() - low);
        }
        return res;
    }
}