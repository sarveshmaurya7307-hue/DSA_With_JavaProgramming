package Loops;

public class tableOf19 {
    public static void main(String[] args) {

        // bekar code : i= 19,20,21,.....190 -> 171 times
        // 171 rounds  / iterations = number of time i change its value

//        for(int i=19; i<=190; i++){
//            if(i%19==0) System.out.println(i);
//        10 rounds only
        for(int i=19; i<=190; i+=19) {
            System.out.println(i);


        }
    }
}
