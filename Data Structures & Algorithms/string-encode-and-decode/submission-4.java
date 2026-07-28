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
            System.out.println(num);
            System.out.println("dad"+str.charAt(i));
            
            //int j = i+1;
            if(str.charAt(i)== '#'){
                int num2 = Integer.parseInt(num);
                decoded_strs.add(str.substring(i+1,i+num2+1));
                i = i+num2+1; 
                num = "";
                System.out.println("000");  
                continue; 
            }
            num+=str.charAt(i);
            i++;
            
        }
        System.out.println(decoded_strs);
        return decoded_strs;
    }
}
