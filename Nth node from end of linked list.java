class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	 if (head == null || n <= 0) {
            return -1; // Invalid input
        }

        Node slow = head;
        Node fast = head;

        // Move fast pointer n nodes ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return -1; // N is greater than the length of the linked list
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }
}
