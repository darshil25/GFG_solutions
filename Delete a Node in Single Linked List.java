class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here	
	    if (x == 1) {
            return head.next;
        }

        Node prev = null;
        Node current = head;
        int count = 1;

        while (count < x && current != null) {
            prev = current;
            current = current.next;
            count++;
        }

        if (current == null) {
            return head;
        }

        prev.next = current.next;

        return head;
    }
}
