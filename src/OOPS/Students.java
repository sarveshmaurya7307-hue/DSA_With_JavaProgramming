package OOPS;

public class Students {
        // creating a new data type
       public String name;
         int rno;
        double percent;
        final String schoolName="RPM";

        // default constructor
    public Students(){

    }

        public Students(String naam, int roll, double per){  // constructor
            name=naam;
            rno=roll;
            percent=per;


        }

        public int getRno(){  // getter
            return rno;
        }

//        public void setRno(int roll){  //setter
//            rno=roll;
//
//    }
    public void setRno(int rno){  // this
            this.rno=rno;
    }

    // Constructor-
    // student s1 = new student ("sarvesh",67,96.3);


}
