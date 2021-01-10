//The program is correct, but Time Limit Exceeded

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int y_size = matrix.length;
        int x_size = matrix[0].length;
        int cur_y = 0;
        int cur_x = 0;
        
        return helper(cur_y,cur_x,matrix,target,y_size,x_size);
        
    }
    
    public boolean helper(Integer y,Integer x,int[][] matrix, int target,int y_size,int x_size)
    {
        if(matrix[y][x] == target)
            return true;
        
        boolean down = false;
        boolean right = false;
        boolean down_right = false;
            
        if(y+1<y_size && matrix[y+1][x]<=target)
            down = helper(y+1,x,matrix,target,y_size,x_size);
            
        if(x+1<x_size && matrix[y][x+1]<=target)
            right = helper(y,x+1,matrix,target,y_size,x_size);
            
        if(y+1<y_size && x+1<x_size && matrix[y+1][x+1]<=target)
            down_right =helper(y+1,x+1,matrix,target,y_size,x_size);   
        
        return down || right || down_right;
            
    }
}