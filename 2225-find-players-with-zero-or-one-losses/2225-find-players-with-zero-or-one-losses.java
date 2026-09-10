import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] it : nums) {
            int loser = it[1];
            map.put(loser, map.getOrDefault(loser, 0) + 1);
        }

        List<Integer> notLost = new ArrayList<>();
        List<Integer> oneLos = new ArrayList<>();

        for (int[] it : nums) {
            int win = it[0];
            int loser = it[1];

            if (map.get(loser) == 1) {
                oneLos.add(loser);
            }

            if (!map.containsKey(win)) {
                notLost.add(win);
                map.put(win, 0);
            }
        }

        Collections.sort(notLost);
        Collections.sort(oneLos);

        return Arrays.asList(notLost, oneLos);
    }
}