class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        Map<String, Integer> voteCount = new HashMap<>();

        for (String candidate : arr) {
            voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        }

        String winnerName = "";
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            String candidate = entry.getKey();
            int votes = entry.getValue();

            if (votes > maxVotes || (votes == maxVotes && candidate.compareTo(winnerName) < 0)) {
                winnerName = candidate;
                maxVotes = votes;
            }
        }

        return new String[]{winnerName, String.valueOf(maxVotes)};
    }
}
