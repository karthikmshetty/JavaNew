import java.util.Stack;

public class BalancedString {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets onto stack
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // For closing brackets, check if stack matches
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (ch == ')' && top != '(') return false;
                if (ch == ']' && top != '[') return false;
                if (ch == '}' && top != '{') return false;
            }
        }

        // Stack must be empty at the end
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("({[]})"));  // true
        System.out.println(isBalanced("([)]"));    // false
        System.out.println(isBalanced("{[}"));     // false
        System.out.println(isBalanced(""));        // true
    }
}