package Realization;

import interfaces.Smartphones;

public class Iphones implements Smartphones {
    @Override
    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "from an iPhone smartphone");
    }

    @Override
    public void sms(String phoneNumber, String message) {
        System.out.println("Sending sms to " + phoneNumber + "from an iPhone smartphone");
        System.out.println("Message " + message);
    }

    @Override
    public void internet() {
        System.out.println("browsing the internet from iPhone smartphone");
    }
}
