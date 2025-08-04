class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        
        for(int t=0;t<tokens.length;t++){
            String i=tokens[t];
            if(!i.equals("+") && !i.equals("-") &&!i.equals("*")&&!i.equals("/")){
                stack.push(Integer.parseInt(i));
            }
            else{
               int b=stack.pop();
               int a=stack.pop();
                int result=0;
                if(i.equals("+")){
                    result=a+b;
                }
                else if(i.equals("-")){
                    result=a-b;
                }
                else if(i.equals("*")){
                    result=a*b;
                }
                else if(i.equals("/")){
                    result=a/b;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }
}