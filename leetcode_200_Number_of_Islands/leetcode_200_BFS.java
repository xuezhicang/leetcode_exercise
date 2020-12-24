class Solution {
    public int numIslands(char[][] grid) {
        
        int y_size = grid.length;
        int x_size = grid[0].length;
        int total_size = y_size*x_size; 
        
        int number_island = 0;
        int[][] visted = new int[y_size][x_size];
        Queue<Integer> q = new LinkedList<Integer>();
        System.out.println("y_size   " + y_size);
        System.out.println("x_size    " + x_size);
        
        
        for(int i=0;i<total_size;i++)
        {
            
            if(grid[i/x_size][i%x_size] == '1' && visted[i/x_size][i%x_size] == 0 )
            {
                
                number_island = number_island + 1;
                q.add(i);
                
                
                //System.out.println("the new island start at:  " +  i + " .they are: "+i/x_size +"  "+i%x_size);
                visted[i/x_size][i%x_size] = 1;  
                while(q.isEmpty()!= true)
                {
                    int q_size = q.size();
                    for(int k = 0;k<q_size;k++)
                    {
                        int cur_pos = q.poll();
                        //System.out.println("we are looking at  " +  cur_pos + " .they are: "+cur_pos/x_size +"  "+cur_pos%x_size);
                        
                        int n = cur_pos/x_size;
                        int m = cur_pos%x_size;
                        if((n-1)>=0 && grid[n-1][m] == '1' && visted[n-1][m] ==0  )
                        {
                            //System.out.println("up");
                            q.add((n-1)*x_size + m);
                            visted[n-1][m] = 1;
                        }
                        if(n+1<y_size && grid[n+1][m] == '1' && visted[n+1][m] ==0)
                        {  
                            //System.out.println("down");
                            q.add((n+1)*x_size + m);                               
                            visted[n+1][m] = 1;                                
                        }
                        if(m+1<x_size && grid[n][m+1] == '1' && visted[n][m+1] ==0)
                        {
                            //System.out.println("right");
                            q.add(n*x_size + m+1);                               
                            visted[n][m+1] = 1;                                 
                        }
                        if(m-1>=0  && grid[n][m-1] == '1' && visted[n][m-1] ==0)
                        {
                            //System.out.println("left");
                            q.add(n*x_size + m-1);                              
                            visted[n][m-1] = 1;                                 
                        }                         
                    }                                                                
                }                                                
            }            
        }            
        return number_island;
    }
}