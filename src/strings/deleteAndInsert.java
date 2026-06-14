package strings;

public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("abcde");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb);  // abce
        System.out.println(sb.charAt(3));  // e
        sb.append("anish");
        System.out.println(sb);  // abceanish
        sb.delete(2,6);
        System.out.println(sb);  // abish

        // insert
        sb.insert(2,'f');
        System.out.println(sb);  // abfish

        // String Arrays ---
        String[] arr = {"Sar","anish","Skills","sania"};


    }
}
