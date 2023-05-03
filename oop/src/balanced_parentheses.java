import java.util.Stack;

public class balanced_parentheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            } else {
                if (s.empty()) {
                    return false;
                }
                char top = s.peek();
                if ((str.charAt(i) == ')' && top == '(') || (str.charAt(i) == ']' && top == '[')
                        || (str.charAt(i) == '}' && top == '{')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.empty();
    }

    public static void main(String[] args) {
        String str = "(((())))";
        if (isValid(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
