package TNSIFJAVA.src.org.tnsif.acc.c2tc.opps;

public class Method_overloading {
    int add(int a, int b){
        return a+b;
    }
    int add(float a, float b){
        return (int) (a+b);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
    void add(String a, String b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Method_overloading obj = new Method_overloading();
        obj.add(10, 20);
        obj.add(10.5, 20.5);
        obj.add(10.5f, 20.5f);
        obj.add("Hello ", "World");
    }
}
