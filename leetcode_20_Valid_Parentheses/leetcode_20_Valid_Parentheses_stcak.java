class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' )
            {
                stack.push(s.charAt(i));
            }            
            else if(stack.size()>0 && s.charAt(i)==')' && stack.peek() == '(')
            {
                stack.pop();
            }
            else if(stack.size()>0 && s.charAt(i)==']' && stack.peek() == '[')
            {
                stack.pop();
            }
            else if(stack.size()>0 &&s.charAt(i)=='}' && stack.peek() == '{')
            {
                stack.pop();
            }   
            else
            {
                stack.push(s.charAt(i));
            }
        }
        
        if(stack.size()>=1)
        {
            return false;
        }
        return true;
    }
}