// the algorithm is correct, the Time Limit Exceeded 

class Solution {
    int effect = Integer.MAX_VALUE;
    int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};
    public int minimumEffortPath(int[][] heights) {
        
        
        return backtracking(heights,0,0,0); 
        
    }
    
    public int backtracking(int[][] heights, int y,int x,int cur_max_effort)
    {
        if(y==heights.length-1 && x ==heights[0].length-1)
        {
            effect = Math.min(cur_max_effort,effect);
            return cur_max_effort;
        }
        
        int temp = heights[y][x];
        heights[y][x] = 0;
        int min_effort = Integer.MAX_VALUE;
        for(int i=0;i<4;i++)
        {
            int new_y = y + move[i][0];
            int new_x = x + move[i][1];
            
            if(new_y>=0 && new_y<heights.length && new_x>=0 && new_x < heights[0].length && heights[new_y][new_x]!=0 )
            {

                int maxCurrentDifference = Math.max(Math.abs(temp-heights[new_y][new_x]),cur_max_effort);
                
                if(maxCurrentDifference < effect )
                {
                    int res = backtracking(heights,new_y,new_x,maxCurrentDifference);
                    min_effort = Math.min(min_effort,res);
                    
                }
                
            }
                
        }
        heights[y][x] = temp;
        return min_effort;
    }
}