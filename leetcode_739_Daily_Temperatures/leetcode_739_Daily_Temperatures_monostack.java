class Solution {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        
        // use the days array to recode the difference 
        //between the current index and the warmer days index
        int[] days = new int[T.length];
        
        //go through the T array    
        for(int i = 0; i<T.length;i++)
        {
            //if the stack is not empty AND 
            //the current temperatures is higher than the temperatures in the stack
            //we pop the elements and calculate the difference between days.
            while(stack.isEmpty() != true && T[i]>T[stack.peek()])
            {
                days[stack.peek()] = i - stack.peek();
                stack.pop();
                
            }
            
            //push the current T[i] in the stack
            stack.push(i);
        }
            
        return days;
    }
}