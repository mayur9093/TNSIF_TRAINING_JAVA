package org.tnsif.acc.c2tc.opps;

class Device{
    String name;
    void display(){
        System.out.println("Device Name: "+name);
    }

}
class phone extends Device{
    String type;
    void display(){
        super.display();
        System.out.println("Phone Type: "+type);
    }
}
class smartphone extends phone{
    String type;
    void display(){
        super.display();
        System.out.println("Smartphone Type: "+type);
    }
}



public class Multilevelinheritance {
    public static void main(String[] args) {
        smartphone s= new smartphone();
        s.name="Apple";
        s.type="Iphone";
        s.display();
    }
}
