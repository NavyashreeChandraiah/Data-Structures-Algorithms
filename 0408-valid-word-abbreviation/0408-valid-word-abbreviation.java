class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int wordLen = word.length(), abbrLen = abbr.length();
        int wordIndex = 0, abbrIndex = 0;

        while(abbrIndex < abbrLen){
            char c = abbr.charAt(abbrIndex);
            if(Character.isDigit(c)){
                if(c=='0') return false;
                int number =0;
                while(abbrIndex < abbrLen && Character.isDigit(abbr.charAt(abbrIndex))){
                    number = number*10 + (abbr.charAt(abbrIndex) - '0');
                    abbrIndex++;
                }
                wordIndex += number;
            } else {
                if(wordIndex >= wordLen || word.charAt(wordIndex)!= c ) return false;
                wordIndex++;
                abbrIndex++;
            }
        }
    return wordIndex == wordLen;

    }
}