package TNSIFJAVA.src.org.tnsif.acc.c2tc.opps;

class employee{
    void company(){
        System.out.println("Company Name: TNSIF");
    }
}
class developer extends employee{
    void role(){
        System.out.println("software department: ");
    }
}
class tester extends employee{
    void role(){
        System.out.println("testing department: ");
    }
}


public class Hybridlevelinheritance {
        public static void main(String[] args) {
            developer d= new developer();
            d.company();
            d.role();
            tester t= new tester();
            t.company();
            t.role();
        }
}
