import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String str = "(){}]";
        System.out.println(validParen(str));
    }

    public static boolean validParen(String str) {
        int n = str.length();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    if (st.peek() == '(' && c == ')' || st.peek() == '{' && c == '}' || st.peek() == '[' && c == ']') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
