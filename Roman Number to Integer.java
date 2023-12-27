class Solution {
    // Finds decimal value of a given roman numeral
    private static int getValue(char romanSymbol) {
        switch (romanSymbol) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    
    public int romanToDecimal(String str) {
        int result = 0;

        for (int i = 0; i < str.length(); i++) {

            int currentVal = getValue(str.charAt(i));

            if (i + 1 < str.length()) {
                int nextVal = getValue(str.charAt(i + 1));

                if (currentVal < nextVal) {
                    result += (nextVal - currentVal);
                    i++; 
                    continue;
                }
            }

            result += currentVal;
        }

        return result;
    }
}
