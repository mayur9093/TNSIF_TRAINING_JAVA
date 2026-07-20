package TNSIFJAVA.src.org.tnsif.acc.c2tc.javabasics;

public class VariableDemo {
    int price = 10;

    void display(){
        String message = "hello";
        System.out.println(message);

    }
    static String msg = "hello students";
    public static void main(String[] args) {
        VariableDemo vr =  new VariableDemo();
        System.out.println(msg);
        System.out.println(vr.price);
        vr.display();

    }
}
