import java.util.HashMap;
import java.util.Stack;
//this is to find the valid parenthesis
public class Solution3 {
    public static void main(String[] args) {
        String s="()";
        Solution3 solution3= new Solution3();

        System.out.println(solution3.isValid(s));
            }
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // If the current character is an opening bracket, push it onto the stack
            if (map.containsKey(currentChar)) {
                stack.push(currentChar);
            } else {
                // If the current character is a closing bracket
                if (stack.isEmpty() || currentChar != map.get(stack.pop())) {
                    // If the stack is empty or the current character doesn't match the corresponding opening bracket
                    return false;
                }
            }
        }

        // If there are remaining opening brackets in the stack, the string is not valid
        return stack.isEmpty();
    }
}







