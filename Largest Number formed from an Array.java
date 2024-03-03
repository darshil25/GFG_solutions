
class Solution {
    String printLargest(int n, String[] arr) {

        Comparator<String> com = new Comparator<String>() {
            public int compare(String a, String b) {
                String s1 = a + b;
                String s2 = b + a;

                return s2.compareTo(s1);
            }
        };

        Arrays.sort(arr, com);

        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }
        return result.toString();
    }
}
