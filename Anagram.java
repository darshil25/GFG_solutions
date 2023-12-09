class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        if(a.length() != b.length()){
        return false; 
    }
    
    // Create frequency arrays of sizes 26 for lowercase English letters
    int[] freqA = new int[26]; 
    int[] freqB = new int[26];
    
    // Increment frequency of each character in both strings
    for(int i=0; i<a.length(); i++){
        freqA[a.charAt(i)-'a']++; 
        freqB[b.charAt(i)-'a']++;
    }
    
    // Check if frequency array of both strings is same
    for(int i=0; i<26; i++){
        if(freqA[i] != freqB[i]){
            return false;
        }
    }
    
    return true;
        
    }
}
