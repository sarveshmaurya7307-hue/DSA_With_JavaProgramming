package oops;

public class StudentClass {
    public static class Student{
        // creating a new data type

        String name ;
       private int rno;
        double percent;
    }
    public static class Car{
        String name;
        String type;
        int price;
    }
    public static void main(String[] args) {
        Student x = new Student();    // declaration
        x.name ="Sarvesh";
        x.rno = 46;
        x.percent = 98.4;
//        System.out.println(x.name);
//        System.out.println(x.roll_no + 4);

        Student s = new Student();
        s.name= "Azad";
        s.rno= 59;
        s.percent= 75;
//        System.out.println(s.getRno());
//        s.setRno(67);
//        System.out.println(s.getRno());


    }
}
