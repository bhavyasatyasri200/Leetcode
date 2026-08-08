class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                stack.pop();
            }

            else if (operations[i].equals("D")) {
                int ans = stack.peek();
                stack.push(ans * 2);
            }

            else if (operations[i].equals("+")) {
                int ans = stack.pop();
                int ans1 = stack.peek();

                stack.push(ans);
                stack.push(ans + ans1);
            }

            else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}