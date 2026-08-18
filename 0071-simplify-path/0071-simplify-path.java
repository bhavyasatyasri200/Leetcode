class Solution {
    public String simplifyPath(String path) {
        String[] parts=path.split("/");
        Stack<String> stack=new Stack<>();
        for(String part:parts){
            if( part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(part.equals("") || part.equals(".") ){
                continue;
            }
            else{
                stack.push(part);
            }
        }
        StringBuilder st=new StringBuilder();
        for(String s:stack){
            st.append('/');
            st.append(s);
        }
        if(stack.isEmpty()) return "/";
        else return st.toString();
    }
}