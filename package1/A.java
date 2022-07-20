package package1;

import javax.sound.midi.SysexMessage;

import package2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defaultMessage);
        System.out.println(c.publicMessage);
    }

    protected String protectedMessage = "This is protected";

}
