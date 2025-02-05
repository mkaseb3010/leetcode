package DailyQuestionJanuary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class January25 {
    class Solution {
        static class UnionFind {
            private int[] parent, rank;

            public UnionFind(int size) {
                parent = new int[size];
                rank = new int[size];

                for (int i = 0; i < size; i++) {
                    parent[i] = i;
                    rank[i] = 1;
                }
            }

            public int find(int x) {
                if (parent[x] != x) {
                    parent[x] = find(parent[x]);
                }
                return parent[x];
            }

            public void union(int x, int y) {
                int rootX = find(x);
                int rootY = find(y);

                if (rootX != rootY) {
                    if (rank[rootX] > rank[rootY]) {
                        parent[rootY] = rootX;
                    }else if(rank[rootX] < rank[rootY]) {
                        parent[rootX] = rootY;
                    }else {
                        parent[rootY] = rootX;
                        rank[rootX]++;
                    }
                }
            }
        }
        public int[] lexicographicallySmallestArray(int[] nums, int limit) {
            int n = nums.length;
            int[] result = new int[n];
            int[][] arr = new int[n][2];

            for (int i = 0; i < n; i++) {
                arr[i] = new int[]{nums[i], i};
            }
            
            Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
            UnionFind uf = new UnionFind(n);

            for (int i = 1; i < n; i++) {
                if (arr[i][0] - arr[i - 1][0] <= limit) {
                    uf.union(arr[i][1], arr[i - 1][1]);
                }
            }

            Map<Integer, List<Integer>> mapIndices = new HashMap<>();
            Map<Integer, List<Integer>> mapValues = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int root = uf.find(arr[i][1]);
                mapIndices.computeIfAbsent(root, k -> new ArrayList<>()).add(arr[i][1]);
                mapValues.computeIfAbsent(root, k -> new ArrayList<>()).add(arr[i][0]);
            }

            for (int root : mapIndices.keySet()) {
                List<Integer> indices = mapIndices.get(root);
                List<Integer> values = mapValues.get(root);
                Collections.sort(values);
                Collections.sort(indices);

                for (int i = 0; i < indices.size(); i++) {
                    result[indices.get(i)] = values.get(i);
                }
            }
            return result;
        }
    }
}
