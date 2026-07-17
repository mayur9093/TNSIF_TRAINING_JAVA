package TNSIFJAVA;

public class variable {
    int num = 10;
    static String name = "mayur";
    public static void main(String[] args) {
        int num = 20;
        System.out.println(num);
        variable v = new variable();
        System.out.println(v.num);
        System.out.println(name);
        System.out.println(variable.name);
        
    }
}
