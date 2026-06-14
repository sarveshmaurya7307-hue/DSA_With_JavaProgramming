package strings;

public class subString {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(s.substring(2));  //cde
        System.out.println(s.substring(1,4));  //  bcd
        System.out.println(s.substring(2,2));   // nothing
        System.out.println(s.substring(0,5));   //abcde
      //  System.out.println(s.substring(2,3));  // c


        // empty String
        String x = " " ;
        System.out.println(x);

        // substring(i0
        // substring(i,J) -> from i to j-1


        // print all substring
        String a = "anish";
        for(int i=0; i<a.length(); i++){
            for(int j=i+1; j<=a.length(); j++){
                System.out.print(a.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
