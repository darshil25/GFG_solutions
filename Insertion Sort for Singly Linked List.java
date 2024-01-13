if (head_ref == null || head_ref.next == null) {
        return head_ref;
    }

    Node sortedList = null;
    Node current = head_ref;

    while (current != null) {
        Node next = current.next;
        sortedList = sortedInsert(sortedList, current);
        current = next;
    }

    return sortedList;
}

private static Node sortedInsert(Node sortedList, Node newNode) {
    if (sortedList == null || sortedList.data >= newNode.data) {
        newNode.next = sortedList;
        return newNode;
    } else {
        Node current = sortedList;
        while (current.next != null && current.next.data < newNode.data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return sortedList;
    }
