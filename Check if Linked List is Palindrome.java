class Solution
{

    boolean isPalindrome(Node head) 
    {
        Node temp = head;
        Stack<Integer> stack = new Stack<>();

        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            int val = stack.pop();
            if (temp.data != val) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }    
}
