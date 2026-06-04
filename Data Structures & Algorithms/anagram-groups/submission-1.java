
class Solution {
    public List<List<String>> groupAnagrams(String[] words) {

     List<List<String>> result = new ArrayList<>();

     boolean[] marked = new boolean[words.length];
     
    for (int i = 0; i < words.length; i++) {
      if(marked[i]){
        continue;
      }

      List<String> group = new ArrayList<>();
      group.add(words[i]);
      marked[i] = true;
      
      result.add(group);

      for (int j = i+1; j < words.length; j++) {
          if(!marked[j] && isAnagram(words[i], words[j])){
            group.add(words[j]);
            marked[j] = true;
          } 
      }
    };
    
    

    return result;
       
    }

    public boolean isAnagram(String a, String b) {
      final int[] duplicates = new int[26];
      for (int i = 0; i < a.length(); i++) {
            int xx = a.charAt(i)-97;
            duplicates[xx]=duplicates[xx]+1;
      }

      for (int i = 0; i < b.length(); i++) {
            int xx = b.charAt(i)-97;
            duplicates[xx]=duplicates[xx]-1;
      }
       for (int i = 0; i < duplicates.length; i++) {
           if(duplicates[i] != 0){
             return false;
           }
           
      }

      return true;
}
    
}
