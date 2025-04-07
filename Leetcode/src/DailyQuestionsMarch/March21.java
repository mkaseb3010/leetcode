package DailyQuestionsMarch;

import java.util.*;

public class March21 {
    class Solution {
        public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
            Map<String, List<String>> graph = new HashMap<>();
            Map<String, Integer> inDegree = new HashMap<>();
            Set<String> supplySet = new HashSet<>(Arrays.asList(supplies));
            Queue<String> queue = new LinkedList<>();
            List<String> result = new ArrayList<>();
    
            for (int i = 0; i < recipes.length; i++) {
                String recipe = recipes[i];
                inDegree.put(recipe, ingredients.get(i).size());
    
                for (String ing : ingredients.get(i)) {
                    graph.computeIfAbsent(ing, k -> new ArrayList<>()).add(recipe);
                }
            }
    
            for (String s : supplies) {
                queue.offer(s);
            }
    
            while (!queue.isEmpty()) {
                String curr = queue.poll();
    
                if (!graph.containsKey(curr)) {
                    continue;
                }
    
                for (String neighbor : graph.get(curr)) {
                    inDegree.put(neighbor, inDegree.get(neighbor) - 1);
    
                    if (inDegree.get(neighbor) == 0) {
                        queue.offer(neighbor);
                        result.add(neighbor);
                    }
                }
            }
            return result;
        }
    }
}
