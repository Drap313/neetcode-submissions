class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < strs.size();i++){
            int num = strs.get(i).length();
            sb.append(num+"#"+strs.get(i));

        }
        System.out.println(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList<>();
        String num = "";
        int i = 0;

        
        while(i<str.length()){

            if(str.charAt(i)== '#'){
                int num2 = Integer.parseInt(num);
                decoded_strs.add(str.substring(i+1,i+num2+1));
                i = i+num2+1; 
                num = "";
                  
                continue; 
            }
            num+=str.charAt(i);
            i++;
            
        }
        return decoded_strs;
    }
}
