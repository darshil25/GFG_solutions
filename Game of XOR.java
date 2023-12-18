class Solution {
    static int gameOfXor(int N , int[] A) {
        if(A.length % 2 == 0){
            return 0;
        }
        int sum = A[0];
        for(int i=2; i<A.length; i=i+2){
            sum = sum^A[i];
        }
        return sum;
    }
};
