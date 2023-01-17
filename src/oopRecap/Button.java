package oopRecap;

import oop.AndroidPhone;

public class Button {

    public static void main(String[] args) {
//        Microphone m1 = new Microphone();
//
//        m1.setSize(16);
//
//        System.out.println(m1.getSize());
//        System.out.println(m1.hasGuarantee);
//        // -----------------------------
//        SmartPhone sp = new SmartPhone();
//        sp.brand = "IPhone";
//        sp.takePicture();
//
//        MacbookPro mp = new MacbookPro();

        AndroidPhone ap = new AndroidPhone();

        AndroidPhone ap2 = new AndroidPhone("White", "GooglePixel");
        System.out.println(ap2.brand);



    }
}
