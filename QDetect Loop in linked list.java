class Solution {
    public static boolean detectLoop(Node h){
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            if (s.contains(h))
                return true;
            s.add(h);
 
            h = h.next;
        }
 
        return false;
    }
}
