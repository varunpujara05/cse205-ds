class Solution {
    public boolean backspaceCompare(String s, String t) {
      return bs(s).equals(bs(t));
  }

    public String bs(final String s) {
    StringBuilder sb = new StringBuilder();
    for (final char ch : s.toCharArray())
      if (ch != '#')
        sb.append(ch);
      else if (sb.length() != 0)
        sb.deleteCharAt(sb.length() - 1);
    return sb.toString();  
    }
}