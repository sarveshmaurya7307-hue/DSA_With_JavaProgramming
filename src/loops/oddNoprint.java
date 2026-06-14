package loops;

public class oddNoprint {
    public static void main(String[] args) {
//
//        // 100 iteration
//        for(int i=1; i<=100; i++){
//            if(i%2!=0) System.out.print(i+" ");
//        }
//
//        // 50 iterations
//        for(int i=1; i<=100; i+=2){
//            System.out.print(i+" ");
//        }

        // 100 iteration ( continue )
        for(int i=1; i<=100; i++){
            if(i%2==0) continue;
            System.out.print(i+" ");
        }


    }
}
