class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String s : operations) {
            if (s.equals("+")) {
                int a = stack.pop();
                int new_s = a + stack.peek();
                stack.push(a);
                stack.push(new_s);
            }
            else if (s.equals("D")) {
                stack.push(2 * stack.peek());
            }
            else if (s.equals("C")) {
                stack.pop();
            }
            else stack.push(Integer.parseInt(s));
        }

        int total = 0;
        while (!stack.isEmpty()) total += stack.pop();

        return total;
    }
}