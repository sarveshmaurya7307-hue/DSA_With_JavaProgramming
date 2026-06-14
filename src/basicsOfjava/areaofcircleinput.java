package basicsOfjava;
import java.util.Scanner;
public class areaofcircleinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        int r ;
        r = sc.nextInt();
        double pi = 3.1415;
        double area = pi*r*r;
        System.out.println("the area of circle is :  "+area);
    }
}
