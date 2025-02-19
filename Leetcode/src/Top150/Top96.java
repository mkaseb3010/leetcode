package Top150;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Top96 {
    class Solution {
        public int minMutation(String startGene, String endGene, String[] bank) {
            Set<String> validGenes = new HashSet<>(Arrays.asList(bank));

            if (!validGenes.contains(endGene)) {
                return -1;
            }

            char[] choices = {'A', 'C', 'G', 'T'};
            Queue<String> queue = new LinkedList<>();
            Set<String> visited = new HashSet<>();
            queue.offer(startGene);
            visited.add(startGene);
            int mutations = 0;

            while (!queue.isEmpty()) {
                int size = queue.size();

                for (int i = 0; i < size; i++) {
                    String currentGene = queue.poll();

                    if (currentGene.equals(endGene)) {
                        return mutations;
                    }

                    char[] geneArray = currentGene.toCharArray();
                    
                    for (int j = 0; j < geneArray.length; j++) {
                        char originalChar = geneArray[j];

                        for (char c : choices) {
                            if (geneArray[j] == c) {
                                continue;
                            }

                            geneArray[j] = c;
                            String mutatedGene = new String(geneArray);

                            if (!visited.contains(mutatedGene) && validGenes.contains(mutatedGene)) {
                                visited.add(mutatedGene);
                                queue.offer(mutatedGene);
                            }
                        }
                        geneArray[j] = originalChar;
                    }
                }
                mutations++;
            }
            return -1;
        }
    }
}
