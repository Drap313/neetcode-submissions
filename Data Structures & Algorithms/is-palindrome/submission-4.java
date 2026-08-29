class Solution {
    public boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str);
        for(int i = 0; i<str.length();i++){
            if(!(str.charAt(i) == (str.charAt((str.length()-1)-i)))){
                return false;
            }
        }


        return isPalindrome;
    }
}
