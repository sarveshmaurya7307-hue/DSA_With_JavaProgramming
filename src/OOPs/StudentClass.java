package OOPs;

public class StudentClass {
//    public static class Student{
//        // creating a new data type
//
//        String name ;
//       private int roll_no;
//        double percentage;
//    }
//    public static class Car{
//        String name;
//        String type;
//        int price;
//    }
    public static void main(String[] args) {
        Student x = new Student();    // declaration
        x.name ="Sarvesh";
        x.roll_no = 46;
        x.percentage = 98.4;
//        System.out.println(x.name);
//        System.out.println(x.roll_no + 4);

        Student s = new Student();
        s.name= "Azad";
        s.roll_no= 59;
        s.percentage= 75;
        System.out.println(s.getRoll_no());
        s.setRoll_no(67);
//        System.out.println(s.roll_no);


    }
}
