package org.tnsif.acc.c2tc.Interface;

 interface SmartDeviceDemo {
    void calling();
    void AIintegration();
    void Satellitecomm();
    void Healtmonitoring();
    

}
class phone implements SmartDeviceDemo{
    @Override
    public void calling() {
        System.out.println("phone is having calling feature");
    }
    @Override
    public void AIintegration() {
        System.out.println("Ai is interated");
    }
    @Override
    public void Satellitecomm() {
        System.out.println("Satellite is integrated");
    }
    @Override
    public void Healtmonitoring() {
        System.out.println("Healtmonitoring is integrated");
    }
}

public class SmartDevice {
    public static void main(String[] args) {
        phone p = new phone();
        p.calling();
        p.AIintegration();
        p.Satellitecomm();
        p.Healtmonitoring();
    }
}

