package Top150;

import java.util.Stack;

public class Top53 {
    public class Solution {
        public String simplifyPath(String path) {
            Stack<String> stack = new Stack<>();
            String[] components = path.split("/");

            for (String directory : components) {
                if (!stack.isEmpty() && directory.equals("..")) {
                    stack.pop();
                }else if (!directory.equals("") && !directory.equals(".") && !directory.equals("..")) {
                    stack.push(directory);
                }
            }

            StringBuilder result = new StringBuilder();
            for (String dir : stack) {
                result.append("/").append(dir);
            }

            return result.length() == 0 ? "/" : result.toString();
        }
    }
}
