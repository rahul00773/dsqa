package string;

import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {

        System.out.println(isBalancedParentheses("{{[]}}"));

    }

    public static boolean isBalancedParentheses(String s) {

        if (s == null || s.isEmpty()) {
            return false;
        }

        Stack<Character> sc = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '{' || x == '(' || x == '[') {
                  sc.push(s.charAt(i));
            }

            if (sc.isEmpty())
                return false;

            switch (x) {

                case ')':
                    sc.pop();
                    if (x == '{' || x == '[')
                        return false;
                    break;

                case ']':
                    sc.pop();
                    if(x=='{' || x=='[')
                        return false;
                    break;

                case '}':
                    sc.pop();
                    if(x=='[' || x=='(')
                        return false;
                    break;

            }
        }

        return (sc.isEmpty());

    }

}