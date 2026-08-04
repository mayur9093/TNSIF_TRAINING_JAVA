package TNSIFJAVA.src.org.tnsif.acc.c2tc.opps;
public class constructor_overloading {
    int a;
    int b;
    constructor_overloading(){
        System.out.println("default constructor");
    }
    constructor_overloading(int a){
        System.out.println(a);
    }
    constructor_overloading(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        constructor_overloading obj = new constructor_overloading();
        constructor_overloading obj1 = new constructor_overloading(10);
       constructor_overloading obj2 = new constructor_overloading(100, 200);
       
        
    }
}
