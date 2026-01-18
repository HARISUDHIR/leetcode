class Solution {
    String res="";
    public String mergeAlternately(String word1, String word2) {
        return solve(word1, word2, 0,0);
    }
    public String solve(String word1, String word2, int i, int j){
        if(i>=word1.length() && j>=word2.length()) return res;
        if(i<word1.length())  res += word1.charAt(i);
        if(j<word2.length())  res += word2.charAt(j);        
        return solve(word1, word2, i+1, j+1);
    }
}