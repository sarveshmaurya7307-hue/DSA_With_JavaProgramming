package OOPs;
import OOPs.Students;
public class Constructors {
    public static void main(String[] args) {
        Students s = new Students("sarvesh",67,93.5);
        System.out.println(s.name);
        System.out.println(s.rno);
        System.out.println(s.percent);
        System.out.println(s.schoolName);

        Students s1= new Students("rahul",76,93.6);
    }
}
