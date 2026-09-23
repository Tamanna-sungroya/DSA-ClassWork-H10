import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, new ArrayList<>(), new boolean[nums.length], ans);
        return ans;
    }

    void solve(int[] a, List<Integer> l, boolean[] used, List<List<Integer>> ans) {
        if (l.size() == a.length) {
            ans.add(new ArrayList<>(l));
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (used[i] || (i > 0 && a[i] == a[i-1] && !used[i-1])) continue;

            used[i] = true;
            l.add(a[i]);
            solve(a, l, used, ans);
            l.remove(l.size() - 1);
            used[i] = false;
        }
    }
}