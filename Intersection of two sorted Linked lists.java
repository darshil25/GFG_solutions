class Solution
{
   public static Node findIntersection(Node a, Node b)
    {
        Node result = new Node(0);
        Node curr = result;

        while (a != null && b != null) {
            if (a.data == b.data) {
                curr.next = new Node(a.data);
                curr = curr.next;
 
                a = a.next;
                b = b.next;
            }
            else if (a.data < b.data)
                a = a.next;
            else
                b = b.next;
        }
        result = result.next;
        return result;
    }
}
