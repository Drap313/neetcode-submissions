class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int len = str.length()-1;
        for(int i = 0; i<str.length();i++){
            if(!(str.charAt(i) == (str.charAt((len)-i)))){
                return false;
            }
        }
        return true;
    }
}
