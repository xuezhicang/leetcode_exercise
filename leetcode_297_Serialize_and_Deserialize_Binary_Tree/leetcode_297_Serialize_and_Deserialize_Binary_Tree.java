public class Codec {
    String str = "";
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)
        {
            str += "null,";
            return "null";
        }     
        str += Integer.toString(root.val)+",";
        serialize(root.left);
        serialize(root.right);        
        //System.out.println(str);
        return str;
             
    }
    public TreeNode helper(List<String> str_lst){
        if(str_lst.get(0).equals("null"))
        {   str_lst.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(str_lst.get(0)));
        str_lst.remove(0);
        root.left = helper(str_lst);
        root.right = helper(str_lst);        
        return root;
        
    }
    
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        String[] data_array = data.split(",");
        List<String> str_lst =  new LinkedList<String>(Arrays.asList(data_array));
        
        
        return helper(str_lst);
        
    }
}