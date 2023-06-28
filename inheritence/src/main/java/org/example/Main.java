package org.example;


public class Main {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;

        StringBuilder hw = new StringBuilder();
        hw.append(num1).append("+").append(num2).append("=").append(num1+num2);
        String dodavanya =hw.toString();

        hw = new StringBuilder();
        hw.append(num1).append("-").append(num2).append("=").append(num1-num2);
        String vidnimanya = hw.toString();

        hw = new StringBuilder();
        hw.append(num1).append("*").append(num2).append("=").append(num1*num2);
        String mnojenya = hw.toString();

        System.out.println(dodavanya);
        System.out.println(vidnimanya);
        System.out.println(mnojenya);

        hw = new StringBuilder(dodavanya);
        hw.replace(hw.indexOf("="),hw.indexOf("=")+1,"равно");
        String dodavanyaModified = hw.toString();

        hw = new StringBuilder(vidnimanya);
        hw.replace(hw.indexOf("="),hw.indexOf("=")+1,"равно");
        String vidnimanyaModified = hw.toString();

        hw = new StringBuilder(mnojenya);
        hw.replace(hw.indexOf("="),hw.indexOf("=")+1,"равно");
        String mnojenyaModified = hw.toString();

        System.out.println(dodavanyaModified);
        System.out.println(vidnimanyaModified);
        System.out.println(mnojenyaModified);
    }
}