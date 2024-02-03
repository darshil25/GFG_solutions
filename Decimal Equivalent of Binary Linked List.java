class Solution
{
   long DecimalValue(Node head)
   {
 	    long res =0;
       int mod = 1000000007;
       while(head!=null){
           res = (res<<1)%mod;
           res = (res + head.data)%mod;
           head = head.next;
       }
       return res;
   }
}
