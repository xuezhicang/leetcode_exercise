class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int max_rec = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        //create a new array, its last element is 0;
        int[] new_heights = new int[heights.length+1];
        for(int i = 0;i<heights.length;i++)
        {
            new_heights[i] = heights[i];
        }
        new_heights[new_heights.length-1] = 0;
        
        // go through every element in the new_heights
        for(int i = 0;i<new_heights.length;i++)
        {
            while(stack.isEmpty() != true && new_heights[stack.peek()] >= new_heights[i])
            {
                int cur = new_heights[stack.peek()];
                stack.pop();
                int size_stack = 0;
                if(stack.size()>0)
                    size_stack = stack.peek();
                else
                    size_stack = -1;
                        
                max_rec = Math.max(max_rec,cur*(i-size_stack-1));    
                
            }
            stack.push(i);
            
        }

        return max_rec;
    
    }
}