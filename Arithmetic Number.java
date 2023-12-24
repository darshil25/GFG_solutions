class Solution{
    static int inSequence(int A, int B, int C){
        if (C == 0) {
            return (A == B) ? 1 : 0;
        }

        int n = (B - A) / C + 1;

        if (n > 0 && (B - A) % C == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
