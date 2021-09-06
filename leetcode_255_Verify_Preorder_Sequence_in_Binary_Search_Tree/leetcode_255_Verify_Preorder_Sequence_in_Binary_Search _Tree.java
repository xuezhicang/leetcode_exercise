class Solution {
    
    public boolean helper(int[] preorder, int start, int end){
        if(end - start<=1) return true;
        
        boolean res = true;
        int idx = start+1;
        while(idx<=end && preorder[start]>preorder[idx] ){ 
            idx++;
        }
        int goon = idx;
        
        while(goon<=end)
        {
            if(preorder[goon]<preorder[start])
                res = false;
            goon++;
        }
        return res && helper(preorder,start+1,idx-1) && helper(preorder,idx,end);
  
    }

    public boolean verifyPreorder(int[] preorder) {
        return helper(preorder,0,preorder.length-1);
        
    }
}