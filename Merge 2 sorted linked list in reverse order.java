class GfG
{
    Node reverseList(Node curr) {
        if (curr == null || curr.next == null)
            return curr;

        Node res = reverseList(curr.next);
        curr.next.next = curr;
        curr.next = null;
        return res;
    }

    Node mergeResult(Node node1, Node node2) {
        if (node1 == null)
            return reverseList(node2);
        if (node2 == null)
            return reverseList(node1);

        Node curr = new Node(0);
        Node head = curr;

        while (node1 != null && node2 != null) {
            if (node1.data < node2.data) {
                curr.next = node1;
                node1 = node1.next;
            } else {
                curr.next = node2;
                node2 = node2.next;
            }
            curr = curr.next;
        }

        while (node1 != null) {
            curr.next = node1;
            node1 = node1.next;
            curr = curr.next;
        }

        while (node2 != null) {
            curr.next = node2;
            node2 = node2.next;
            curr = curr.next;
        }

        head = head.next;
        return reverseList(head);
    }
}
