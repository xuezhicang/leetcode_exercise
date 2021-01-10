//Divide and Conquer

class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int y_size = matrix.length;
        int x_size = matrix[0].length;
        
        
        //the coordinates: up,left,down right
        return helper(0,0,y_size-1,x_size-1,matrix,target);
        
        
    }
    
    
    public boolean helper(int up,int left,int down,int right,int[][] matrix,int target)
    {
        //if the boundary is not correct, return false
        if(up>down || left>right)
            return false;
        
        //if the target is smaller than upper-left coner 
        // or greater than the lower-right coner
        //  return false        
        if(matrix[up][left]>target || matrix[down][right]<target)
            return false;
        
        // get the mid column index
        int mid = left + (right-left)/2;
        

        //traverse from the first row to the row 
        //  whose matrix[row][mid] is not greater than target
        int row = up;
        while(down>=row && matrix[row][mid]<=target)
        {
            if(matrix[row][mid] == target)
            {
                return true;
            }
            row++;
            
        }

        //find the number in the lower-left martix and upper-right martix. 
        return helper(row,left,down,mid-1,matrix,target) || helper(up,mid+1,row-1,right,matrix,target);
        
        
        
    }
}