package strings;

public class plusOperator {
    public static void main(String[] args) {
        String s="abc";
        s=s+"def";   // adding two string
        s=s+10;
        String t ="ghi";
        s+=t;
        s=10+s;
        System.out.println(s);
        System.out.println("abc"+10+20);  // abc1020
        System.out.println(10+20+"abc");  // 30abc
    }
}
