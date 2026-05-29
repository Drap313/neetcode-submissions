class Solution {
    public boolean isAnagram(String s, String t) {
        java.util.HashMap<String,Integer> map = new java.util.HashMap<>();
        java.util.HashMap<String,Integer> map2 = new java.util.HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for (int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(""+c)){
                map.put(""+c,map.get(""+c)+1);
            }
            else{
                map.put(""+c,0);
            }
        }
        for (int i = 0; i<t.length();i++){
            char c = t.charAt(i);
            if(map2.containsKey(""+c)){
                map2.put(""+c,map2.get(""+c)+1);
            }
            else{
                map2.put(""+c,0);
            }
        }
        for(String i : map.keySet()){
            if(!(map.get(i).equals(map2.get(i)))){
                return false;
            }
        }
        return true;
}


}