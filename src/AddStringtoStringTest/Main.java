package AddStringtoStringTest;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "c";
        String s3 = "d";
        String s4 = "e";
        StringBuilder sb = new StringBuilder();
        StringJoiner sj = new StringJoiner("");
        System.out.println(s1);
        System.out.println(s1 + s2);
        System.out.println(s1.concat(s3));
        System.out.println(sb.append(s1).append(s2).append(s3).append(s4));
        System.out.println(sj.add(s1));
        System.out.println(sj.add(s2));
        System.out.println(String.join(s3,s4,s1));
    }
}
