import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.naming.ldap.LdapContext;

public class leetcode {
    public static void main(String[] args) throws Exception {
        
        leetcode lc = new leetcode();

        // int[] nums = {18,15,13,7,5,26,25,29};
        // System.out.println(minCost(30, nums));
        // int[] rains = {1,2,0,0,2,1};
        // var res = avoidFlood(rains);
        // for (int i : res) {
        // System.out.print(i + ",");
        // }
        // int[] h = {3, 11, 2};
        // int[] v = {1};
        // System.out.println(maxArea(5, 2, h, v));

        // String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
        // System.out.println(maxProduct(words));

        // String s = "AAAAAAAAAAA";
        // findRepeatedDnaSequences(s);

        // int[] nums = {3,10,5,25,2,8};
        // System.out.println(findMaximumXOR(nums));

        // int[][] grid = {{1,0,0,0},{1,0,0,0},{1,0,0,0},{1,0,0,0},{1,0,0,0}};
        // System.out.println(possibleToStamp(grid, 4, 3));
        // CountIntervals countIntervals = new CountIntervals();
        // countIntervals.add(571, 770);
        // countIntervals.add(920, 996);
        // countIntervals.add(65, 512);
        // countIntervals.add(959, 959);
        // countIntervals.add(313, 330);
        // countIntervals.add(473, 928);

        // Random r = new Random();
        // System.out.println(r.nextInt(5));

        // System.out.println(canJump(new int[]{3,2,1,0,4}));

        // int[][] matrix = {{0,0,0},{1,0,1},{0,1,1},{0,0,1}};
        // System.out.println(maximumRows(matrix, 2));

        // int[][] pts = {{0,0}, {1,0}, {-1,0}, {0,1}, {0, -1}};
        // System.out.println(numberOfBoomerangs(pts));

        // System.out.println(maximumSwap(98368));

        // int[] nums = {6,5,3,9,2,7};
        // List<Integer> a = new ArrayList<>();
        // for (Integer integer : nums) {
        // a.add(integer);
        // }
        // System.out.println(maximumSumOfHeights(a));

        // int[] nums =
        // {471,626,848,957,788,138,982,721,729,956,432,1000,478,353,586,544,304,811,359,535,992,684,606,39,384,799,120,608,540,914,19,62,410,711,449,370,263,890,124,516,861,936,729,595,768,929,649,803,65,692,548,620,871,785,15,629,251,764,973,484,172,923,859,29,297,215,436,74,762,885,272,504,307,998,83,329,520,889,584,496,443,802,180,322,640,290,292,403,11,230,743,183,600,741,558,780,970,777,288};
        // numsGame(nums);

        // int[] nums = { 1, 5, 6, 8, 9, 12, 15, 16, 20 };
        // System.out.println(min(nums, 10));

        // int[] nums = {7,12,9,8,9,15};
        // System.out.println(findKOr(nums, 4));

        // StringBuilder sb = new StringBuilder();
        

        // System.out.println(Integer.numberOfLeadingZeros(2));


        // int[] nums = {-2,0,3,-5,2,-1};
        // NumArray na = new NumArray(nums);
        // System.out.println(na.sumRange(0, 2));
        // System.out.println(na.sumRange(2, 5));
        // System.out.println(na.sumRange(0, 5));


        // int[][] data = {{131,1,95,208,38,257,123,204,101}, 
        //                 {185,165,292,109,266,259,97,234,60}, 
        //                 {55,281,38,61,204,243,32,54,164}, 
        //                 {106,230,202,4,65,243,89,139,211}, 
        //                 {192,246,11,294,119,43,250,161,110}, 
        //                 {71,279,288,173,64,48,216,26,276}, 
        //                 {23,206,152,106,288,286,270,131,12}, 
        //                 {115,64,251,108,194,295,131,249,121}};
        // System.out.println(maxMoves(data));


        // int[] coins = {1,2,5};
        // System.out.println(change(5, coins));

        // System.out.println(maximumBinaryString("000110"));

        // int[] changed = {3,3,3,3};
        // System.out.println(findOriginalArray(changed));

        // System.out.println(combinationSum3(9, 45));

        // lc.LC1673();

        // System.out.println(2 ^ 1);


        // char[][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
        // lc.countBattleships(board);

        // int[] people = {3,2,2,1};
        // lc.numRescueBoats(people, 3);


        var s = lc.discountPrices("706hzu76jjh7yufr5x9ot60v149k5 $7651913186 pw2o $6", 28);
        System.out.println(s);
        System.out.println(Integer.MAX_VALUE);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return mid;
    }

    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<Integer> ids = new ArrayList<Integer>();
        List<Integer> ratings = new ArrayList<Integer>();
        for (int[] rest : restaurants) {
            if (rest[2] >= veganFriendly && rest[3] <= maxPrice && rest[4] <= maxDistance) {
                ids.add(0, rest[0]);
                ratings.add(0, rest[1]);
            }
        }
        for (int i = 0; i < ids.size() - 1; i++) {
            for (int j = 0; j < ids.size() - i - 1; j++) {
                if (ratings.get(j) < ratings.get(j + 1)) {
                    var temp = ratings.get(j);
                    ratings.set(j, ratings.get(j + 1));
                    ratings.set(j + 1, temp);
                    temp = ids.get(j);
                    ids.set(j, ids.get(j + 1));
                    ids.set(j + 1, temp);
                } else if (ratings.get(j) == ratings.get(j + 1)) {
                    if (ids.get(j) < ids.get(j + 1)) {
                        var temp = ratings.get(j);
                        ratings.set(j, ratings.get(j + 1));
                        ratings.set(j + 1, temp);
                        temp = ids.get(j);
                        ids.set(j, ids.get(j + 1));
                        ids.set(j + 1, temp);
                    }
                }
            }
        }
        return ids;
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            int j = 0;
            if (flowerbed[i] == 0) {
                j++;
            } else {
                if (j > 0) {
                    n -= (j - 1) / 2;
                    if (n <= 0) {
                        return true;
                    }
                }
                j = 0;
            }
        }
        return false;
    }

    public static int splitNum(int num) {
        char[] numChr = new Integer(num).toString().toCharArray();
        Arrays.sort(numChr);
        int num1 = 0;
        int num2 = 0;
        int n = numChr.length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                num1 = num1 * 10 + (numChr[i] - '0');
            } else {
                num2 = num2 * 10 + (numChr[i] - '0');
            }
        }
        return num1 + num2;
    }

    public static int sumDistance(int[] nums, String s, int d) {
        long dis = 0;
        int n = nums.length;
        long[] pos = new long[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'R') {
                pos[i] = nums[i] + d;
            } else {
                pos[i] = nums[i] - d;
            }
        }
        Arrays.sort(pos);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n - 1; j++) {
                dis += pos[j + 1] - pos[i];
                if (dis > 100000007)
                    dis -= 1000000007;
            }
        }
        return (int) dis;
    }

    public static int findCircleNum(int[][] isConnected) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        int n = isConnected.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(i);
            map.put(i, set);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    var seti = map.get(i);
                    var setj = map.get(j);
                    if (seti != setj) { // i，j不在一个集合，合并这两个集合
                        for (Integer jciy : setj) {
                            seti.add(jciy);
                            map.put(jciy, seti);
                        }
                    }
                }
            }
        }
        Set<Set<Integer>> res = new HashSet<>(map.values());
        return res.size();
    }

    public static int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> xPair = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (!xPair.containsKey(nums[i] * nums[j])) {
                    xPair.put(nums[i] * nums[j], 1);
                } else {
                    xPair.put(nums[i] * nums[j], xPair.get(nums[i] * nums[j]) + 1);
                }
            }
        }
        int res = 0;
        for (Integer c : xPair.values()) {
            res += c * (c - 1) / 2;
        }
        return res * 8;
    }

    // public static int minCost(int n, int[] cuts) {
    // set.add(0);
    // set.add(n);
    // var cuts1 = Arrays.copyOf(cuts, cuts.length + 2);
    // cuts1[cuts1.length - 1] = n;
    // Arrays.sort(cuts1);
    // return minCost(0, n, cuts1);
    // }
    // static Set<Integer> set = new HashSet<>(); //已经切过的点

    // public static int minCost(int l, int r, int[] cuts){
    // int mid = l + ((r - l) >> 1); //每次尽可能从中点附近切
    // int preCut = findClosestCut(mid, cuts); //找到距中点最近且没被切过的点
    // if(preCut <= l || preCut >= r){
    // return 0;
    // }
    // set.add(preCut);
    // return (r-l) + minCost(l, preCut, cuts) + minCost(preCut, r, cuts);
    // }
    // public static int findClosestCut(int p, int[] cuts){ //找到距中点最近且没被切过的点
    // int i = 0;
    // for (; i < cuts.length; i++) {
    // if(p <= cuts[i]){
    // break;
    // }
    // }
    // int a = i - 1;
    // int b = i;
    // while(a>=0 && b<cuts.length){
    // if(p - cuts[a] < cuts[b] - p){
    // if(!set.contains(cuts[a])){
    // return cuts[a];
    // }
    // a--;
    // } else{
    // if(!set.contains(cuts[b])){
    // return cuts[b];
    // }
    // b++;
    // }
    // }
    // return 0;
    // }

    public static long countPairs(int n, int[][] edges) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            map.put(i, list);
        }
        // 并查集
        for (int[] edge : edges) {
            var fromSet = map.get(edge[0]);
            var toSet = map.get(edge[1]);
            if (fromSet.size() < toSet.size()) {
                var temp = fromSet;
                fromSet = toSet;
                toSet = temp;
            }
            if (fromSet != toSet) {
                for (Integer node : toSet) {
                    fromSet.add(node);
                    map.put(node, fromSet);
                }
            }
        }
        long res = 0;
        for (var set : map.values()) {
            res += n - set.size();
        }
        return res / 2;
    }

    public static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int res = 0;
        int temp = 0;
        int i = n - 1;
        for (; i >= 0; i--) {
            temp += satisfaction[i];
            if (temp <= 0) {
                break;
            }
            res += temp;
        }
        return res;

    }

    public static List<Integer> lexicalOrder(int n) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            char[] s1 = a.toString().toCharArray();
            char[] s2 = b.toString().toCharArray();
            for (int i = 0; i < Math.min(s1.length, s2.length); i++) {
                if (s1[i] == s2[i]) {
                    continue;
                }
                return s1[i] - s2[i];
            }
            return s1.length - s2.length;
        });
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(queue.poll());
        }
        return res;
    }

    public int minCost(int n, int[] cuts) {
        int[] cuts1 = new int[cuts.length + 2];
        for (int i = 0; i < cuts.length; i++) {
            cuts1[i] = cuts[i];
        }
        cuts1[cuts1.length - 2] = 0;
        cuts1[cuts1.length - 1] = n;
        Arrays.sort(cuts1);
        return minCostFnc(cuts1, 0, cuts1.length - 1);
    }

    public int minCostFnc(int[] cuts, int l, int r) {
        if (l + 1 == r) {
            return 0;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = l + 1; i < r; i++) {
            res.add(cuts[r] - cuts[l] + minCostFnc(cuts, l, i) + minCostFnc(cuts, i, r));
        }
        Collections.sort(res);
        return res.get(0);
    }

    public static int[] avoidFlood(int[] rains) {
        int n = rains.length;
        if (n <= 1) {
            return new int[0];
        }
        int[] res = new int[n];
        Arrays.fill(res, 1);
        TreeSet<Integer> st = new TreeSet<>(); // 不下雨的天下标
        HashMap<Integer, Integer> checked = new HashMap<>(); // （湖泊，下标）
        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                st.add(i);
            } else {
                res[i] = -1;
                if (!checked.containsKey(rains[i])) { // 该湖泊第一次下雨
                    checked.put(rains[i], i);
                } else { // 第二次下雨
                    int index = checked.remove(rains[i]);
                    Integer zero = st.ceiling(index);
                    if (zero == null) {
                        return new int[0];
                    }
                    st.remove(zero);
                    res[zero] = rains[i];
                }
            }
        }
        return res;
    }

    public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int[] hCuts = new int[horizontalCuts.length + 1];
        Arrays.sort(horizontalCuts);
        hCuts[0] = horizontalCuts[0];
        int i = 1;
        for (; i < hCuts.length - 1; i++) {
            hCuts[i] = horizontalCuts[i] - horizontalCuts[i - 1];
        }
        hCuts[i] = h - horizontalCuts[i - 1];
        int hMax = 0;
        for (int hCut : hCuts) {
            hMax = Math.max(hMax, hCut);
        }
        int[] vCuts = new int[verticalCuts.length + 1];
        Arrays.sort(verticalCuts);
        vCuts[0] = verticalCuts[0];
        i = 1;
        for (; i < vCuts.length - 1; i++) {
            vCuts[i] = verticalCuts[i] - verticalCuts[i - 1];
        }
        vCuts[i] = w - verticalCuts[i - 1];
        int vMax = 0;
        for (int vCut : vCuts) {
            vMax = Math.max(vMax, vCut);
        }
        return (int) (1L * hMax * vMax % 1000000007);
    }

    public int countPoints(String rings) {
        HashMap<Character, HashSet<Character>> map = new HashMap<>();
        char[] chs = rings.toCharArray();
        int n = chs.length / 2;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(chs[2 * i + 1])) {
                HashSet<Character> set = new HashSet<>();
                set.add(chs[2 * i]);
                map.put(chs[2 * i + 1], set);
            } else {
                map.get(chs[2 * i + 1]).add(chs[2 * i]);
            }
        }
        int res = 0;
        for (HashSet<Character> c : map.values()) {
            if (c.size() == 3) {
                res++;
            }
        }
        return res;
    }

    public static int maxProduct(String[] words) {
        int n = words.length;
        int[] bits = new int[n]; // 位表示单词字符是否出现
        for (int i = 0; i < n; i++) {
            String word = words[i];
            int bit = 0;
            for (int j = 0; j < word.length(); j++) {
                bit = bit | (1 << word.charAt(j) - 'a');
            }
            bits[i] = bit;
        }
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((bits[i] & bits[j]) == 0) {
                    res = Math.max(res, words[i].length() * words[j].length());
                }
            }
        }
        return res;
    }

    public static int findMaximumXOR(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Integer.max(max, nums[i]);
        }
        int highBit = 31 - Integer.numberOfLeadingZeros(max);
        int res = 0;
        int mask = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = highBit; i >= 0; i--) {
            mask = mask | (1 << i);
            set.clear();
            int temp = res | (1 << i);
            for (Integer integer : nums) {
                integer &= mask;
                if (set.contains(temp ^ integer)) {
                    res = temp;
                    break;
                }
                set.add(integer);
            }
        }
        return res;
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        int n = s.length();
        if (n < 10) {
            return new ArrayList<String>();
        }
        HashMap<Character, Integer> code = new HashMap<>(); // 碱基由2位整数代替，长度为10的序列可由32位整数的小20位来表示
        code.put('A', 0);
        code.put('C', 1);
        code.put('G', 2);
        code.put('T', 3);
        HashMap<Integer, Integer> map = new HashMap<>(); // 出现过的序列
        int f = 0; // 第一个长度为10的序列
        int range = (1 << 20) - 1; // 表示长度为10的序列的范围
        for (int i = 0; i < 10; i++) {
            f = (f << 2) + code.get(s.charAt(i));
        }
        map.put(f, 1);
        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n - 10; i++) {
            f = ((f << 2) + code.get(s.charAt(i + 9))) & range;
            map.put(f, map.getOrDefault(f, 0) + 1);
            if (map.get(f) == 2) {
                res.add(s.substring(i, i + 10));
            }
        }
        return res;
    }

    public int vowelStrings(String[] words, int left, int right) {
        HashSet<Character> vowel = new HashSet<>() {
            {
                add('a');
                add('e');
                add('i');
                add('o');
                add('u');
            }
        };
        int res = 0;
        for (int i = left; i <= right; i++) {
            if (vowel.contains(words[i].charAt(0)) && vowel.contains(words[i].charAt(words[i].length() - 1))) {
                res++;
            }
        }
        return res;
    }

    // 1094. 拼车
    public static boolean carPooling(int[][] trips, int capacity) {
        int[] count = new int[1001];
        int n = trips.length;
        for (int i = 0; i < n; i++) {
            for (int j = trips[i][1]; j < trips[i][2]; j++) {
                count[j] += trips[i][0];
                if (count[j] > capacity) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean carPooling2(int[][] trips, int capacity) {
        int[] da = new int[1002]; // 差分数组
        int n = trips.length;
        for (int i = 0; i < n; i++) {
            da[trips[i][1]] += trips[i][0];
            da[trips[i][2]] -= trips[i][0];
        }
        n = da.length;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur += da[i];
            if (cur > capacity) {
                return false;
            }
        }
        return true;
    }

    // 可获得的最大点数
    // 暴力递归：时间复杂度高
    // 记忆化搜索：空间复杂度高
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int[][][] dp = new int[n][n][k + 1];
        return maxScoreDp(cardPoints, 0, cardPoints.length - 1, k, dp);
    }

    public int maxScoreDp(int[] cardPoints, int l, int r, int rest, int[][][] dp) {
        if (dp[l][r][rest] != 0) {
            return dp[l][r][rest];
        }
        if (rest == 1) {
            dp[l][r][rest] = Math.max(cardPoints[l], cardPoints[r]);
        } else {
            dp[l][r][rest] = Math.max(cardPoints[l] + maxScoreDp(cardPoints, l + 1, r, rest - 1, dp),
                    cardPoints[r] + maxScoreDp(cardPoints, l, r - 1, rest - 1, dp));
        }
        return dp[l][r][rest];
    }

    // 逆向思维：滑动窗口，求滑动窗口的最小值
    public int maxScore1(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int m = n - k;
        int sum = 0;
        int allSum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (i < m) {
                sum += cardPoints[i];
                allSum += cardPoints[i];
            } else {
                min = Math.min(min, sum);
                sum -= cardPoints[i - m];
                sum += cardPoints[i];
                allSum += cardPoints[i];
            }
        }
        min = Math.min(min, sum);
        return allSum - min;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    // public TreeNode bstToGst(TreeNode root) {

    // }

    // LC2132 邮票贴满网格图
    public static boolean possibleToStamp(int[][] grid, int stampHeight, int stampWidth) {
        int m = grid.length;
        int n = grid[0].length;
        // 二维滑动窗口
        int[][] check = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                check[i][j] = grid[i][j] == 1 ? -1 : 0;
            }
        }
        for (int i = 0; i <= m - stampHeight; i++) {
            for (int j = 0; j <= n - stampWidth; j++) { // 窗口内可以放邮票的话让check中的格子++
                boolean flag = false;
                for (int x = 0; x < stampHeight; x++) {
                    for (int y = 0; y < stampWidth; y++) {
                        if (grid[i + x][j + y] == 1) {
                            flag = true;
                            j = j + y;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
                if (!flag) { // 可以放
                    for (int x = 0; x < stampHeight; x++) {
                        for (int y = 0; y < stampWidth; y++) {
                            check[i + x][j + y]++;
                        }
                    }
                    j = j + stampWidth - 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (check[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 2415. 反转二叉树的奇数层
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        boolean isOdd = false;
        while (!que.isEmpty()) {
            int k = que.size();
            ArrayList<TreeNode> list = new ArrayList<>();
            while (k-- > 0) {
                var cur = que.poll();
                if (cur.left != null) {
                    que.add(cur.left);
                    que.add(cur.right);
                }
                if (isOdd) {
                    list.add(cur);
                }
            }
            for (int i = 0; i < list.size() / 2; i++) {
                int tmp = list.get(i).val;
                list.get(i).val = list.get(list.size() - i - 1).val;
                list.get(list.size() - i - 1).val = tmp;
            }
            isOdd = !isOdd;
        }
        return root;
    }

    static class CountIntervals {
        TreeMap<Integer, Integer> map; // 表示区间，按区间开头排序
        int count;

        public CountIntervals() {
            map = new TreeMap<>();
            count = 0;
        }

        public void add(int left, int right) {
            // 把覆盖的区间先删除
            while (true) {
                var node = map.ceilingEntry(left);
                if (node != null && node.getValue() <= right) {
                    map.remove(node.getKey());
                    count -= node.getValue() - node.getKey() + 1;
                } else {
                    break;
                }
            }
            // 合并交叉区间
            var floor = map.floorEntry(left);
            if (floor != null) {
                if (floor.getValue() >= left) {
                    map.remove(floor.getKey());
                    count -= floor.getValue() - floor.getKey() + 1;
                    left = floor.getKey();
                    right = Math.max(right, floor.getValue());
                }
            }
            var ceiling = map.ceilingEntry(left);
            if (ceiling != null) {
                if (ceiling.getKey() <= right) {
                    map.remove(ceiling.getKey());
                    count -= ceiling.getValue() - ceiling.getKey() + 1;
                    right = Math.max(right, ceiling.getValue());
                }
            }
            map.put(left, right);
            count += right - left + 1;
        }

        public int count() {
            return count;
        }
    }

    // CL17. 电话号码的字母组合
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        int n = digits.length();
        if (n == 0) {
            return res;
        }
        String[] map = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        letterCombinationsHelper(res, map, digits, 0, new StringBuffer());
        return res;
    }

    public void letterCombinationsHelper(List<String> res, String[] map, String digits, int index, StringBuffer sb) {
        if (index == digits.length()) {
            res.add(sb.toString());
        } else {
            int digit = digits.charAt(index) - '2';
            String letters = map[digit];
            int ln = letters.length();
            for (int i = 0; i < ln; i++) {
                sb.append(letters.charAt(i));
                letterCombinationsHelper(res, map, digits, index + 1, sb);
                sb.deleteCharAt(index);
            }
        }
    }

    // LC55. 跳跃游戏
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = nums[i];
            for (int j = 0; j < i; j++) {
                if (dp[j] >= i - j) {
                    dp[j] = Math.max(dp[j], nums[i] + i - j);
                }
            }
        }
        return dp[0] >= n - 1;
    }

    // LC1962. 移除石子使总数最小
    public static int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        int res = 0;
        for (int i : piles) {
            res += i;
            heap.add(i);
        }
        while (k-- > 0) {
            var cur = heap.poll();
            res -= cur / 2;
            heap.add(cur - cur / 2);
        }
        return res;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        LinkedList<ListNode> dequeue = new LinkedList<>();
        dequeue.add(head);
        var cur = head.next;
        while (cur != null) {
            while (!dequeue.isEmpty() && dequeue.peekLast().val < cur.val) {
                dequeue.pollLast();
            }
            dequeue.add(cur);
            cur = cur.next;
        }
        var newHead = dequeue.pollFirst();
        cur = newHead;
        while (!dequeue.isEmpty()) {
            cur.next = dequeue.pollFirst();
            cur = cur.next;
        }
        return newHead;
    }

    // 2397. 被列覆盖的最多行数
    public static int maximumRows(int[][] matrix, int numSelect) {
        int m = matrix.length;
        int n = matrix[0].length;
        if (numSelect == n) {
            return m;
        }
        int[] mtx = new int[m]; // matrix转换成二进制数
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mtx[i] |= (matrix[i][j] << j);
            }
        }
        // 枚举选法
        int res = 0;
        for (int cc : fn(n, numSelect)) {
            int ct = 0;
            for (int mtxi : mtx) {
                ct += (mtxi | cc) == cc ? 1 : 0;
            }
            res = Math.max(res, ct);
        }
        return res;
    }

    public static List<Integer> fn(int n, int num) { // 枚举包含num个1的n位整数
        List<Integer> res = new ArrayList<>();
        fn2(0, n, 0, num, res);
        return res;
    }

    public static void fn2(int cur, int n, int i, int rest1, List<Integer> res) { // 来到第i位，还有rest1个1要选
        if (rest1 < 0) {
            return;
        }
        if (n - i == rest1) {
            for (int j = i; j < n; j++) {
                cur |= (1 << j);
            }
            res.add(cur);
            return;
        }
        fn2(cur, n, i + 1, rest1, res);
        fn2((cur | (1 << i)), n, i + 1, rest1 - 1, res);
    }

    // 1944. 队列中可以看到的人数
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && heights[i] > heights[st.peek()]) {
                st.pop();
                res[i]++;
            }
            if (!st.isEmpty()) {
                res[i]++;
            }
            st.push(i);
        }
        return res;
    }

    // 447. 回旋镖的数量
    public static int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    int len = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) +
                            (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                    map.put(len, map.getOrDefault(len, 0) + 1);
                }
            }
            for (var ct : map.values()) {
                res += ct * (ct - 1);
            }
            map.clear();
        }
        return res;
    }

    // LC 670
    public static int maximumSwap(int num) {
        int num1 = num;
        int[] arr = new int[9];
        int i = 0;
        while (num1 != 0) {
            arr[i++] = num1 % 10;
            num1 /= 10;
        }
        int p = -1;
        int maxI = 0;
        for (int j = 0; j < i; j++) {
            if (arr[j] > arr[maxI]) {
                maxI = j;
            } else if (arr[j] < arr[maxI]) {
                p = j;
            }
        }
        if (p >= 0) {
            int tmp = arr[p];
            arr[p] = arr[maxI];
            arr[maxI] = tmp;

            for (int j = i - 1; j >= 0; j--) {
                num1 *= 10;
                num1 += arr[j];
            }
            return num1;
        } else {
            return num;
        }
    }

    // LC 2865
    public static long maximumSumOfHeights(List<Integer> maxHeights) {
        int[] a = maxHeights.stream().mapToInt(i -> i).toArray();
        int n = a.length;
        int[] left = new int[n]; // 从左到i递增数组的最大和
        int[] right = new int[n]; // 从右到i递增数组的最大和
        int[] stack = new int[n];
        int top = -1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            while (top >= 0 && a[i] < a[stack[top]]) {
                int pop = stack[top--];
                left[pop] = sum;
                sum -= a[pop] * (top >= 0 ? pop - stack[top] : pop + 1);
            }
            sum += a[i] * (top >= 0 ? i - stack[top] : i + 1);
            stack[++top] = i;
        }
        while (top >= 0) {
            int pop = stack[top--];
            left[pop] = sum;
            sum -= a[pop] * (top >= 0 ? pop - stack[top] : pop + 1);
        }

        top = -1;
        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            while (top >= 0 && a[i] < a[stack[top]]) {
                int pop = stack[top--];
                right[pop] = sum;
                sum -= a[pop] * (top >= 0 ? stack[top] - pop : n - pop);
            }
            sum += a[i] * (top >= 0 ? stack[top] - i : n - i);
            stack[++top] = i;
        }
        while (top >= 0) {
            int pop = stack[top--];
            right[pop] = sum;
            sum -= a[pop] * (top >= 0 ? stack[top] - pop : n - pop);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, left[i] + right[i] - a[i]);
        }
        return res;
    }

    // LC LCP24
    public static int[] numsGame(int[] nums) {
        final int mod = 1000000007;
        int n = nums.length;
        int[] res = new int[n];
        // 转化
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = nums[i] - i;
        }

        // 对顶堆维护中位数
        PriorityQueue<Integer> left = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> right = new PriorityQueue<>();
        long leftSum = 0, rightSum = 0;
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                if (!left.isEmpty() && left.peek() > nums1[i]) {
                    leftSum -= left.peek() - nums1[i];
                    left.add(nums1[i]);
                    int poll = left.poll();
                    right.add(poll);
                    rightSum += poll;
                } else {
                    right.add(nums1[i]);
                    rightSum += nums1[i];
                }
                res[i] = (int) ((rightSum - leftSum - right.peek()) % mod);
            } else {
                if (nums1[i] > right.peek()) {
                    rightSum += nums1[i] - right.peek();
                    right.add(nums1[i]);
                    int poll = right.poll();
                    left.add(poll);
                    leftSum += poll;
                } else {
                    left.add(nums1[i]);
                    leftSum += nums1[i];
                }
                res[i] = (int) ((rightSum - leftSum) % mod);
            }
        }

        return res;
    }

    public int minimumSeconds(List<Integer> nums) {
        // 把所有数字都变为出现次数最多的那个数字
        int n = nums.size();
        HashMap<Integer, Integer> map = new HashMap<>(); // 统计每个数字出现的次数
        for (int i = 0; i < n; i++) {
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) + 1);
        }
        int maxCount = 0;
        int the1 = 0; // 找出出现次数最多的数字
        for (var kv : map.entrySet()) {
            if (kv.getValue() > maxCount) {
                maxCount = kv.getValue();
                the1 = kv.getKey();
            }
        }

        int[] left = new int[n]; // i位置数字距离左边最近的the1的距离
        for (int i = 0; i < 2 * n; i++) {
            if (nums.get(i % n) == the1) {
                left[i % n] = 0;
            } else {
                left[i % n] = left[(i - 1 + n) % n] + 1;
            }
        }

        int[] right = new int[n]; // i位置数字距离右边最近的the1的距离
        for (int i = 2 * n - 1; i >= 0; i--) {
            if (nums.get(i % n) == the1) {
                right[i % n] = 0;
            } else {
                right[i % n] = left[(i + 1) % n] + 1;
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, Math.min(left[i], right[i]));
        }
        return res;
    }

    public static int max(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (nums[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;

    }

    public static int min(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) >> 1);
            if (nums[mid] >= target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    // LC 2368
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        List<Integer>[] map = new List[n];
        for (int i = 0; i < n; i++) {
            map[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            map[edge[0]].add(edge[1]);
            map[edge[1]].add(edge[0]);
        }
        int[] ban = new int[n];
        for (int i : restricted) {
            ban[i] = 1;
        }
        int[] visited = new int[n];
        visited[0] = 1;
        dfs(0, map, ban, visited);
        int res = 0;
        for (int i : visited) {
            res += i;
        }
        return res;
    }

    public void dfs(int cur, List<Integer>[] map, int[] ban, int[] visited) {
        for (Integer i: map[cur]) {
            if (ban[i] != 1 && visited[i] != 1) {
                visited[i] = 1;
                dfs(i, map, ban, visited);
            }
        }
    }


    // LC 2917
    public static int findKOr(int[] nums, int k) {
        int[] bits = new int[31];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 31; j++){
                if((1 & (nums[i]>>j)) == 1){
                    bits[j]++;
                }
            }
        }
        int res = 0;
        for(int i = 0; i < 31; i++){
            if(bits[i] >= k){
                res |= (1<<i);
            }
        }
        return res;
    }


    // LC 299
    public String getHint(String secret, String guess) {
        int n = secret.length();

        int[] count1 = new int[10];
        int[] count2 = new int[10];
        
        int x = 0, y = 0; //牛牛
        for(int i = 0; i < n; i++){
            if(guess.charAt(i) == secret.charAt(i)){
                x++;
            }else{
                count1[secret.charAt(i) - '0']++;
                count2[guess.charAt(i) - '0']++;
            }
        }
        for(int i = 0; i < 10; i++){
            y += Math.min(count1[i], count2[i]);
        }

        return new StringBuilder().append(x).append("A").append(y).append("B").toString();
    }

    class FindElements {
        TreeNode root;
    
        public FindElements(TreeNode root) {
            this.root = root;
        }
        
        public boolean find(int target) {
            int p = target + 1;
            var cur = this.root;
            for(int i = 30 - Integer.numberOfLeadingZeros(p); i >= 0; i--){
                if(((p>>i) & 1) == 0){
                    cur = cur.left;
                }else{
                    cur = cur.right;
                }
                if(cur == null){
                    return false;
                }
            }
            return true;
        }
    }


    // LC 303???
    static class NumArray {
        int[] nums;
        int[] pre;
    
        public NumArray(int[] nums) {
            Arrays.sort(nums);
            this.nums = nums;
            int n = nums.length;
            this.pre = new int[n + 1];
            for(int i = 1; i < n + 1; i++){
                this.pre[i] = this.pre[i - 1] + nums[i - 1];
            }
        }
        
        public int sumRange(int left, int right) {
            int n = this.nums.length;
            if(left > this.nums[n - 1] || right < this.nums[0]){
                return 0;
            }
            //找大于等于left的最小下标x
            int x = 0;
            int l = 0;
            int r = n - 1;
            while(l <= r){
                int mid = l + ((r - l) >> 1);
                if(this.nums[mid] < left){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
            x = l;
    
    
            //找小于等于right的最大下标y
            int y = 0;
            l = 0;
            r = n - 1;
            while(l <= r){
                int mid = l + ((r - l) >> 1);
                if(this.nums[mid] > right){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }
            y = r;
            return this.pre[y + 1] - this.pre[x];
        }
    }

    // LC 2684
    public static int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int j = n - 2; j >= 0; j--){
            for(int i = 0; i < m; i++){
                if(i > 0 && grid[i][j] < grid[i - 1][j + 1]){
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j + 1] + 1);
                }
                if(grid[i][j] < grid[i][j + 1]){
                    dp[i][j] = Math.max(dp[i][j], dp[i][j + 1] + 1);
                }
                if(i < m - 1 && grid[i][j] < grid[i + 1][j + 1]){
                    dp[i][j] = Math.max(dp[i][j], dp[i + 1][j + 1] + 1);
                }
            }
        }
        int res = dp[0][0];
        for(int i = 1; i < m; i++){
            res = Math.max(res, dp[i][0]);
        }
        return res;
    }

    // LC 518
    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for(int j = 0; j < coins.length; j++){
            for(int i = 1; i < amount + 1; i++){
                if(i >= coins[j]){
                    dp[i] += dp[i - coins[j]];
                }
            }
        }
        return dp[amount];
    }


    // LC 2580
    public int countWays(int[][] ranges) {
        Arrays.sort(ranges, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        list.add(ranges[0]);
        for(int i = 1; i < ranges.length; i++){
            int[] last = list.get(list.size()-1);
            if(ranges[i][0] <= last[1]){
                list.set(list.size()-1, new int[]{last[0], Math.max(last[1], ranges[i][1])});
            }
        }
        return (int)((long)(1L * Math.pow(2, list.size())) % 1000000007);
    }



    // LC 2810
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) =='i'){
                sb = sb.reverse();
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }


    // LC 2009
    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int j = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] != nums[i - 1]){
                nums[j++] = nums[i];
            }
        }
        int size = 0;
        int res = n;
        for(int i = 0; i < j; i++){
            while(nums[i - size] < nums[i] - n + 1){
                size--;
            }
            size++;
            res = Math.min(res, n - size);
        }
        return res;
    }


    // LC 1702
    public static String maximumBinaryString(String binary) {
        int n = binary.length();
        int i = binary.indexOf('0');
        if(i < 0){
            return binary;
        }
        int ct = 0; //1的个数
        for(i++; i < n; i++){
            if(binary.charAt(i) == '1'){
                ct++;
            }
        }
        return "1".repeat(n - 1 - ct) + "0" + "1".repeat(ct);
    }


    // LC 2924
    public int findChampion(int n, int[][] edges) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(i);
        }
        for(int[] edge: edges){
            set.remove(edge[1]);
        }
        return set.size() == 1 ? (int)set.toArray()[0] : -1;
    }

    public static int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if((n & 1) == 1){
            return new int[0];
        }
        Arrays.sort(changed);
        int[] count = new int[changed[n-1] + 1];
        for(int i = 0; i < n; i++){
            count[changed[i]]++;
        }
        int j = 0;
        int[] original = new int[n/2];
        for(int i = 0; i < n; i++){
            while(count[changed[i]] > 0){
                if(changed[i] * 2 >= count.length || count[changed[i] * 2] == 0){
                    return new int[0];
                }
                count[changed[i]]--;
                count[changed[i]*2]--;
                original[j++] = changed[i];
            }
        }
        return original;
    }

    // LC 216
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(1, k, n, cur, res);
        return res;
    }
    // 来到i位置，还要选k个数，剩下target
    public static void dfs(int i, int k, int target, List<Integer> cur, List<List<Integer>> res){
        if(i > 10 || k < 0){
            return;
        }
        if(cur.size() == 8){
            System.out.println("now");
        }
        if(target == 0 && k == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        // 不选
        dfs(i + 1, k, target, cur, res);
        // 选
        cur.add(i);
        dfs(i + 1, k - 1, target - i, cur, res);
        cur.remove(cur.size() - 1);
    }

    // LC1673
    public int[] mostCompetitive(int[] nums, int k) {
        winner = new int[k];
        Arrays.fill(winner, Integer.MAX_VALUE);
        int[] sub = new int[k];
        fn(nums, nums.length, 0, 0, k, sub);
        return winner;

    }

    int[] winner;
    // 来到nums的i位置选不选它作为子序列的第j个数
    public void fn(int[] nums, int n, int i, int j, int k, int[] sub){
        if(i == n && j < k){
            return;
        }
        if(j == k){
            if(compete(sub, winner)){
                winner = sub.clone();
            }
            return;
        }
        // 选i
        sub[j] = nums[i];
        fn(nums, n, i + 1, j + 1, k, sub);
        // 不选
        fn(nums, n, i + 1, j, k, sub);
    }
    
    // 比较两个数组谁有竞争力
    public boolean compete(int[] arr1, int[] arr2){
        int n = arr1.length;
        for(int i = 0; i < n; i++){
            if(arr1[i] < arr2[i]){
                return true;
            }else if(arr1[i] > arr2[i]){
                return false;
            }
        }
        return true;
    }
    public void LC1673(){
        int[] nums = {70,3,34,32,18,67,51,79,44,69,16,0,20,89,43,4,13,22,62,54,61,64,18,53,98,84,48,17,73};
        int[] res = mostCompetitive(nums, 26);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + "\t");
        }
    }

    // LC 1738
    public int kthLargestValue(int[][] matrix, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int cur = 0;
        int[] lastLine = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            cur = 0;
            for(int j = 0; j < matrix[0].length; j++){
                cur ^= matrix[i][j];
                lastLine[j] = lastLine[j] ^ cur;
                if(heap.size() < k){
                    heap.add(lastLine[j]);
                }else if(heap.peek() < lastLine[j]){
                    heap.poll();
                    heap.add(lastLine[j]);
                }
            }
        }
        return heap.peek();
    }

    // LC 2028
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int total = mean * (rolls.length + n);
        for (int i = 0; i < rolls.length; i++) {
            total -= rolls[i];
        }
        if(total < n || total > 6 * n){
            return new int[0];
        }
        int avg = total / n;
        int rest = total % n;
        int[] res = new int[n];
        Arrays.fill(res, 0, rest, avg + 1);
        Arrays.fill(res, rest, n, avg);
        return res;
    }

    // LC 419
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        // 记录是否访问过这个点
        int[][] visited = new int[m][n];
        int res = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(visited[i][j] == 1){ //访问过，跳过
                    continue;
                }
                // 没访问过
                // 如果是.，记录
                if(board[i][j] == '.'){
                    visited[i][j] = 1;
                }else{  // 如果是x，深度优先遍历
                    dfs(i, j, board, visited);
                    res++;
                }
            }
        }
        return res;
    }
    
    // 只需向右或向下遍历
    private void dfs(int i, int j, char[][] board, int[][] visited){
        int ii = i;
        int jj = j;
        while(ii < board.length && board[ii][j] == 'X'){
            visited[ii++][j] = 1;
        }
        while(jj < board[0].length && board[i][jj] == 'X'){
            visited[i][jj++] = 1;
        }
    }

    // LC 881
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int res = 0;
        int n = people.length;
        int l = 0;
        int r = n - 1;
        while(l < r){
            while(r > l && people[l] + people[r] > limit){
                r--;
                res++;
            }
            l++;
            r--;
            res++;
        }
        return res;
    }


    public String discountPrices(String sentence, int discount) {
        String[] words = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(" ");
            if(word.length() > 1 && word.charAt(0) == '$'){
                Long price = null;
                try{
                    price = Long.valueOf(word.substring(1, word.length()));
                }catch(Exception e){}
                if(price != null){
                    res.append("$");
                    res.append(String.format("%.2f", (1.0 * price * (100 - discount) / 100)));
                }else{
                    res.append(word);
                }
            }else{
                res.append(word);
            }
        }
        return res.substring(1, res.length());
    }


    // LCP 61
    public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
        int res = 0;
        int same = 0;
        int n = temperatureA.length;
        for (int i = 1; i < n; i++) {
            if(Integer.compare(temperatureA[i], temperatureA[i - 1]) == Integer.compare(temperatureB[i], temperatureB[i - 1])){
                res = Math.max(res, ++same);
            }else{
                same = 0;
            }
        }
        return res;
    }

    // LC 2742
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = time[i];
            arr[i][1] = cost[i];
        }
        Arrays.sort(arr, new Comparator<int[]>() { //按时间降序排序，时间相同的按花费升序排序
            @Override
            public int compare(int[] a, int[] b){
                if(a[0] == b[0]){
                    return a[1] - b[1];
                }else{
                    return b[0] - a[0];
                }
            }
        });

        int i = 0;
        int res = 0;
        int timeA = 0; //
        while(arr[i][0] > 1){
            res += arr[i][1];
            timeA += arr[i][0];
            i++;
        }
        int j = n - 1;
        while(i <= j){
            while(i <= j && timeA > 0){
                j--;
                timeA--;
            }
            if(i <= j){
                res += arr[i][1];
                timeA++;
                i++;
            }
        }
        return res;
    }


}
