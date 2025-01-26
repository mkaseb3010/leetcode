package DailyQuestionsDecember;

import java.util.PriorityQueue;

public class December15 {
    class Solution {
        private double gain(int pass, int total) {
            return ((double) (pass + 1) / (total + 1)) - ((double) pass / total);
        }

        public double maxAverageRatio(int[][] classes, int extraStudents) {
            PriorityQueue<double[]> maxHeap = new PriorityQueue<>(
                (a, b) -> Double.compare(b[2], a[2])
            );

            for (int[] c : classes) {
                int pass = c[0];
                int total = c[1];
                double gain = gain(pass, total);
                maxHeap.offer(new double[]{pass, total, gain});
            }

            while (extraStudents-- > 0) {
                double[] curr = maxHeap.poll();
                int pass = (int) curr[0];
                int total = (int) curr[1];
                pass++;
                total++;
                maxHeap.offer(new double[]{pass, total, gain(pass, total)});
            }

            double totalRatio = 0.0;

            while (!maxHeap.isEmpty()) {
                double[] c = maxHeap.poll();
                totalRatio += c[0] / c[1];
            }
            return totalRatio / classes.length;
        }
    }
}
