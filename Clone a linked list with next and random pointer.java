class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        if (head == null) {
            return null;
        }

        // Step 1: Insert copy nodes after each original node
        Node current = head;
        while (current != null) {
            Node copyNode = new Node(current.data);
            copyNode.next = current.next;
            current.next = copyNode;
            current = copyNode.next;
        }

        // Step 2: Set random pointers of copy nodes
        current = head;
        while (current != null) {
            if (current.arb != null) {
                current.next.arb = current.arb.next;
            }
            current = current.next.next;
        }

        // Step 3: Separate original and copied linked lists
        Node newHead = head.next;
        current = head;
        while (current != null) {
            Node copyNode = current.next;
            current.next = copyNode.next;
            current = current.next;
            if (current != null) {
                copyNode.next = current.next;
            }
        }

        return newHead;
    }
}
