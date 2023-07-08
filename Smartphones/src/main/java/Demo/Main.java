package Demo;

import Realization.Androids;
import Realization.Iphones;
import interfaces.Smartphones;

public class Main {
    public static void main(String[] args) {
        Smartphones androidPhone = new Androids();
        androidPhone.call("1234567890");
        androidPhone.sms("1234567890","Hello world!android");

        Smartphones iPhone = new Iphones();
        iPhone.call("0987654321");
        iPhone.sms("0987654321","Hello world!iPhone");

    }
}