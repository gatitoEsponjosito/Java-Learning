package package2;

import package1.*;

public class Asub extends A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.protectedMessage);
        System.out.println(c.defaultMessage);
        System.out.println(c.publicMessage);

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);
    }
}
