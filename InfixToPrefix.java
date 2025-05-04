import java.util.*;

public class InfixToPrefix {
    public static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

            default:
                return -1;
        }
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '(')
                sb.append(')');
            else if (ch == ')')
                sb.append('(');
            else
                sb.append(ch);
        }

        return sb.toString();
    }

    public static String infixToPrefix(String s) {
        s = reverse(s);
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop(); // remove '('
            } else {
                while (!stack.isEmpty() && precedence(ch) < precedence(stack.peek())) {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();  // final reverse for prefix
    }

    public static void main(String[] args) {
        String st = "(a+b)*(c-d)";
        System.out.println("Prefix: " + infixToPrefix(st));  // Output: *+ab-cd
    }
}
