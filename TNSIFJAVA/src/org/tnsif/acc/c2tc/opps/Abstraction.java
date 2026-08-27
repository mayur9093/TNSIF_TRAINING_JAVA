package org.tnsif.acc.c2tc.opps;

 abstract class  HeheshDemo{
    void calling(){
        System.out.println("phone is having calling feature");
    }
    abstract void AIintegration();
    abstract void Satellitecomm();
    abstract void Healtmonitoring();
     
}

 abstract class Suresh extends HeheshDemo {
    @Override
    void AIintegration(){
        System.out.println("Ai is interated");
    }
    @Override
     abstract void Satellitecomm();

    @Override
    void Healtmonitoring(){
        System.out.println("Healtmonitoring is integrated");
    }
}

 class hemanth  extends Suresh {
    @Override
    void Satellitecomm(){
        System.out.println("Satellite is integrated");
    }
    @Override
    void Healtmonitoring(){
        System.out.println("Healtmonitoring is integrated");
    }
    
}


public class Abstraction {

    public static void main(String[] args) {
        hemanth h = new hemanth();
        h.calling();
        h.AIintegration();
        h.Satellitecomm();
        h.Healtmonitoring();
    }
    
}
