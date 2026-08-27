package org.tnsif.acc.c2tc.opps;



class course{
    String name;
    void display(){
        System.out.println("Course Name: "+name);
    }

}
class student extends course{
    int id;
    void display(){
        super.display();
        System.out.println("Student ID: "+id);
    }
}
public class Singlelevelinheritance {
    public static void main(String[] args) {
        student s= new student();
        s.name="Java";
        s.id=1001;
        s.display();
    }
   
}



