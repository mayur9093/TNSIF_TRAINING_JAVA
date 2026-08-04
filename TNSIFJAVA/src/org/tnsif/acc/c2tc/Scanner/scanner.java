package TNSIFJAVA.src.org.tnsif.acc.c2tc.Scanner;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        String Name = sc.nextLine();
        System.out.print("Enter Age:");
        int a = sc.nextInt();
        System.out.println("Name :"+Name);
        System.out.println("Age :"+a);
        sc.close();
    }
}
