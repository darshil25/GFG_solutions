class Solution
{
    static int minNumber(int arr[], int n) {
        int sum = 0;
        for(int x : arr) 
            sum += x;
            
        if(isPrime(sum)) 
            return 0;
            
        for(int i=1; i<=100; i++) {
            if(isPrime(sum + i))
                return i;  
        }
        
        return -1;
    }
    
    static boolean isPrime(int num) {
        if (num <= 1) 
            return false;
      
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) 
                return false;
        }
       
        return true;    
    }
}
