class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] components = path.split("/");

        for(String component : components){
            if(component.equals(".") || component.isEmpty()) {
                continue;
            } else if(component.equals("..")){
                //is stack is not empty. pop - move a directory up
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else{
                stack.add(component);
            }

        }
        StringBuilder result = new StringBuilder();
        for(String s : stack){
            result.append("/");
            result.append(s);
        }
        return result.length()>0 ? result.toString() : "/";
    }
}