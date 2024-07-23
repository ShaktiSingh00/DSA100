import java.util.Stack;

public class RemoveOuterParent {
    public static String removeParenthesis(String str) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> s = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                if (s.size() > 0) {
                    sb.append(c);
                }
                s.push(c);
            } else {
                s.pop();
                if (s.size() > 0) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "(()())(())";
        System.out.println(removeParenthesis(str));
    }
}
