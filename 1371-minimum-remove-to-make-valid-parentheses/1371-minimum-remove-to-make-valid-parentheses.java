class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        // Check for null or empty string
        if (s == null || s.isEmpty()) {
            return "";
        }

        // Validate the string contains only allowed characters
        if (!s.matches("[a-z()]*")) {
            throw new IllegalArgumentException("Input string must only contain lowercase letters and parentheses");
        }
        
        for(char c : s.toCharArray()){
            if(c == '(') open++;
            if(c == ')'){
                if(open == 0) continue;
                open--;
            }
            sb.append(c);
        }

        StringBuilder result = new StringBuilder();
        for(int i = sb.length()-1; i>=0; i--){
            if(sb.charAt(i) == '(' && open >0){
                open--;
                continue;
            }
            result.append(sb.charAt(i));
        }
        return result.reverse().toString();
        
    }
}