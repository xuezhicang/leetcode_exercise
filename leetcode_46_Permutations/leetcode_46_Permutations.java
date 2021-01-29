class Solution {
    List<List<Integer>> res = new LinkedList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        
        List<Integer> list= new LinkedList<Integer>();
        backtracking(list,nums);
        
        return res;
    }
    
    public void backtracking(List<Integer> list, int[] nums)
    {
        if(list.size() == nums.length)
        {
            res.add(new LinkedList(list));
            return;
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            backtracking(list,nums);
            list.remove(list.size()-1);
            
        }
    }
}