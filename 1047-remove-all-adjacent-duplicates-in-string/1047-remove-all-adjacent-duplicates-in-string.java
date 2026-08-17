class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder st=new StringBuilder();
        for(char ch:stack){
            st.append(ch);
        }
        return st.toString();
    }
}