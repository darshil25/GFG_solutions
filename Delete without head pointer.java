class Solution
{
    void deleteNode(Node del)
    {
        if (del != null && del.next != null) {

            del.data = del.next.data;

            del.next = del.next.next;
        } 
    }
}
