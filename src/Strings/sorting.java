package Strings;

public class sorting {
    public static void main(String[] args) {
        String s =" Sarvesh";
        char [] ch = s.toCharArray();
//        Arrays.sort(ch);
        for(char ele:ch){
            System.out.println(ele);
        }
        System.out.println();
        StringBuilder sb = new StringBuilder("Maurta");
        char [] arr = sb.toString().toCharArray();
    }

}
