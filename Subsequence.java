import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        subSeq(str, " ");
    }

    public static void subSeq(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }
        subSeq(s.substring(1), ans + s.charAt(0));
        subSeq(s.substring(1), ans);

    }
}
