package Realization;

import interfaces.Smartphones;

public class Androids implements Smartphones {
    @Override
    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "from an Android smartphone");
    }

    @Override
    public void sms(String phoneNumber, String message) {
        System.out.println("Sending sms to " + phoneNumber + "from an Android smartphone");
        System.out.println("Message " + message);
    }

    @Override
    public void internet() {
        System.out.println("browsing the internet from android smartphone");
    }
}
