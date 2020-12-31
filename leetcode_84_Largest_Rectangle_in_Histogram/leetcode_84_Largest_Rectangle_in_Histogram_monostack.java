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

/*
看上去这个解法长得和刚才那道题的差不多。
实际算法也很相近，作者维护了一个单调递增的栈，然后进行了一系列xjb操作。
那么到底为什么可以这么做？我们需要分析一下，每一个元素都要入栈一次，出栈一次。
入栈的时候是for loop的iteration走到它的时候，那出栈的时候意味着什么呢。
想清楚了这一点，我们也就理解了上面的答案。
在上一题，每个元素出栈，是说明它找到了它在原数组中的next greater element.那这道题呢？
元素出栈，意味着，我们已经计算了以它的顶为上边框的最大矩形。
首先我们可以通过反证法轻松证明，最后的结果中的最大矩形的上边框，一定和某一个bar的顶重合，
否则我们一定可以通过提高上边框来增加这个矩形的面积。

这一步之后，我们还需要理解，这时候我们计算的矩形的左右边框都已经到达了极限。
结合栈内元素的单调性，我们知道左边的边框是栈顶的元素+1，栈顶元素所对应的bar一定比出栈元素对应的bar小，
所以以出栈元素对应的bar为高的矩形无法往左边延展。

结合代码，我们知道右边的边框是正在处理的i，
因为我们已经判断过这个第i个元素所对应的bar也一定比出栈元素对应的bar小，
所以矩形无法往右边延展。这个元素和左右边框之间如果还有空隙，那么这些空隙里所存在的bar，
一定是因为维护栈的单调性而被弹出了。换言之，这些bar如果存在，那么一定比这个出栈元素所对应的bar高。
既然这些bar的高度更高，那么就可以被纳入这个最大矩形的计算中（例如一个“凹”字）。
因此我们证明了，当我们将第i个元素弹出栈的时候，我们计算了以hight[i]为高的最大矩形的面积。
from https://zhuanlan.zhihu.com/p/26465701
*/