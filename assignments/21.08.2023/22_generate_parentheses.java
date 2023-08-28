class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesis(res, "", 0, 0, n);
        return res;
    }
    public void generateParenthesis(List<String> res, String s, int o, int c, int n) {
        if (o == n && c == n) {
            res.add(s);
            return;
        }
        if (o < n) {
            generateParenthesis(res, s + "(", o + 1, c, n);
        }
        if (c < o) {
            generateParenthesis(res, s + ")", o, c + 1, n);
        }
    }
}