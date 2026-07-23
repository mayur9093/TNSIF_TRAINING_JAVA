package TNSIFJAVA.src.org.tnsif.acc.c2tc.opps;


 class human {
    private String name;
    private int age;
    
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("AGE: "+age);
    }
    
}
public class Encapsulation {
    public static void main(String[] args) {
        human h= new human();
        h.setAge(10);
        h.setName("Mayur");
        h.display();
        h.setAge(12);
        h.setName("harsh");
        h.display();
    }
}
