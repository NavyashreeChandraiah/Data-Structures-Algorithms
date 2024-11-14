class Solution {
    public int calculate(String s) {
        int currentNumber = 0;
        int lastNumber = 0;
        int result = 0;
        char operation = '+';
        
        if(s==null || s.isEmpty()) return 0;

        for(int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);

            if(Character.isDigit(currentChar)){
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }

            if(!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == s.length()-1){
                if(operation == '+' || operation == '-'){
                    result += lastNumber;
                    lastNumber = (operation == '-')? -currentNumber : currentNumber;
                }
                else if (operation == '*'){
                    lastNumber = lastNumber * currentNumber;
                }
                else if (operation == '/'){
                    lastNumber = lastNumber /currentNumber;
                }
                operation = currentChar;
                currentNumber = 0;
            }

        }
        result += lastNumber;
        return result;
    }
}