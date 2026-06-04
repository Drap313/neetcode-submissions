
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

     
     List<String> words =  new ArrayList<>(Arrays.asList(strs));

     List<List<String>> result = new ArrayList<>();

     
    for (int i = 0; i < words.size(); i++) {
      String word = words.remove(i);
      i--;
      List<String> group = new ArrayList<>();
      group.add(word);
      result.add(group);

      for (int j = i+1; j < words.size(); j++) {
          
          if(isAnagram(word, words.get(j))){
          
            group.add(words.remove(j));
            j--;
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
