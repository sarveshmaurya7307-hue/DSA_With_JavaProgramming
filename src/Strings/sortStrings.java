package Strings;
import java.util.Arrays;
public class sortStrings {
    public static void main(String[] args) {

                String inputString = "Sarvesh";

                String sortedString = sortString(inputString);

                System.out.println("Original String: " + inputString);
                System.out.println("Sorted String: " + sortedString);
            }
            private static String sortString(String str) {

                char[] charArray = str.toCharArray();

                Arrays.sort(charArray);

                return new String(charArray);
            }
        }



