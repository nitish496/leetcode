class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        Set<Integer> players = new HashSet<>();
        Set<Integer> losers = new HashSet<>();
        Set<Integer> oneLoss = new HashSet<>();
        Set<Integer> multipleLoss = new HashSet<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            players.add(winner);
            players.add(loser);

            if (losers.contains(loser)) {
                multipleLoss.add(loser);
            } else {
                losers.add(loser);
                oneLoss.add(loser);
            }
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLossList = new ArrayList<>();

        for (int player : players) {
            if (!losers.contains(player)) {
                zeroLoss.add(player);
            } else if (oneLoss.contains(player) && !multipleLoss.contains(player)) {
                oneLossList.add(player);
            }
        }

        Collections.sort(zeroLoss);
        Collections.sort(oneLossList);

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(zeroLoss);
        answer.add(oneLossList);

        return answer;
    }
}