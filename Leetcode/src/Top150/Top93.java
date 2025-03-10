package Top150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Top93 {
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            List<List<Integer>> adjList = new ArrayList<>();
            int[] inDegree = new int[numCourses];

            for (int i = 0; i < numCourses; i++) {
                adjList.add(new ArrayList<>());
            }

            for (int[] pre : prerequisites) {
                int course = pre[0];
                int prereq = pre[1];

                adjList.get(prereq).add(course);
                inDegree[course]++;
            }

            Queue<Integer> queue = new LinkedList<>();

            for (int i = 0; i < numCourses; i++) {
                if (inDegree[i] == 0) {
                    queue.add(i);
                }
            }

            int completed = 0;

            while (!queue.isEmpty()) {
                int course = queue.poll();
                completed++;

                for (int neighbor : adjList.get(course)) {
                    inDegree[neighbor]--;
                    if (inDegree[neighbor] == 0) {
                        queue.add(neighbor);
                    }
                }
            }
            return completed == numCourses;
        }
    }
}
