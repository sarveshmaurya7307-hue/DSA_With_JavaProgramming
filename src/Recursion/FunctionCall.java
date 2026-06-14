package Recursion;

public class FunctionCall {
    public static void mango(){
        System.out.println("hi I am in mango");

    }
    public static void banana(){
        System.out.println("hi I am in banana");
        mango();
    }
    public static void apple(){
        System.out.println("hi I am in apple");
        banana();
    }
    public static void main(String[] args) {
        System.out.println("hi I am in main methods");
        apple();
    }

}
