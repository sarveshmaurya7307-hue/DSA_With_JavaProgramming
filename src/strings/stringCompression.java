package strings;

public class stringCompression {
    public static void main(String[] args) {
        String s= "aaaaaaddddddeeewwssfffffffkjklkkkk";
        char[] arr = s.toCharArray();
        String ans ="";
       int i=0, j=0;
       while(j<arr.length){
           if(arr[j]==arr[i])  j++;
           else {
               ans +=arr[i];
               int len=j-i;
               if(len>1)  ans +=len;
               i=j;
           }
       }
       // for last group
        ans +=arr[i];
        int len=j-i;
        if(len>1)  ans +=len;
        System.out.println(ans);
    }
}

      // leetcode problem no. 443

class Solution {
    public int compress(char[] arr) {
        StringBuilder ans = new StringBuilder("");
        int i = 0, j = 0;

        while (j < arr.length) {
            if (arr[j] == arr[i]) {
                j++;
            } else {
                ans.append(arr[i]);
                int len = j - i;   // ✅ fixed
                if (len > 1) ans.append(len);
                i = j;
            }
        }

        // last group
        ans.append(arr[i]);
        int len = j - i;   // ✅ fixed
        if (len > 1) ans.append(len);

        // copy back
        for (i = 0; i < ans.length(); i++) {
            arr[i] = ans.charAt(i);
        }

        return ans.length();
    }
}
