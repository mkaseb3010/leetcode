package Top150;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Top94 {
    class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
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

            int[] order = new int[numCourses];
            int index = 0;

            while (!queue.isEmpty()) {
                int course = queue.poll();
                order[index++] = course;

                for (int neighbor: adjList.get(course)) {
                    inDegree[neighbor]--;
                    if (inDegree[neighbor] == 0) {
                        queue.add(neighbor);
                    }
                }
            }

            if (index == numCourses) {
                return order;
            }
            return new int[0];
        }
    }
}
