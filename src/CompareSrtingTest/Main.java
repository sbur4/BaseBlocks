package CompareSrtingTest;

public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1;
        String s3 = new String("abc");
        String s4 = "ABC";
        System.out.println(s1 == s2); //t
        System.out.println(s1.equals(s2));//t
        System.out.println(s1 == s3);//f
        System.out.println(s1.equals(s3));//t
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.contentEquals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
