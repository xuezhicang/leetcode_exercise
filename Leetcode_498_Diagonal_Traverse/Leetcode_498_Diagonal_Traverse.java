class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        
        

        if(matrix == null || matrix.length == 0)
        {
            //System.out.println("wrong input");
            return new int[0];
        }
        int y = matrix.length;
        int x = matrix[0].length;
        int[] res = new int[x*y];
        int max_sum_value = y -1 + x -1;
        
        
        int count = 0;
        for(int i = 0;i<=max_sum_value;i++)
        {
            //System.out.println("i=   "+i);
            int r = 0;
            int c = 0;
            
            if(i%2 == 1)
            {
                if(i < x) { r= 0;c = i;}
                else {r = i-x+1;c = x-1;}
                
                // r < N  is for the  lower-right triangular matrix
                // c >=0  is for the  upper-left triangular matrix
                while(r < y && c>=0) 
                {
                    //System.out.println(r+"   "+c+"   ");
                    //System.out.println(+matrix[r][c]);
                    res[count] = matrix[r][c];
                    r++;
                    c--;
                    count++;
                }                            
            }
            else //i%2 ==0
            {
                if(i < y) { c= 0;r = i;}
                else {r = y-1; c = i-y+1;}   
                //System.out.println("current r c is  "+ r +"   "+c);
                while(c < x && r>=0) 
                {
                    //System.out.println(r+"   "+c+"   ");
                    //System.out.println(matrix[r][c]);
                    res[count] = matrix[r][c];
                    c++;
                    r--;
                    count++;
                }                 
                            
            }
            //System.out.println();
            


        }
        
        
        return res;
                   
        
    }
}