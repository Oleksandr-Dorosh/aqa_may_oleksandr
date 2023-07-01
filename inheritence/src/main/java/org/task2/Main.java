package org.task2;


public class Main {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;

        StringBuilder dodavanya = new StringBuilder();
        dodavanya.append(num1).append("+").append(num2).append("=").append(num1+num2);


        StringBuilder vidnimanya = new StringBuilder();
        vidnimanya.append(num1).append("-").append(num2).append("=").append(num1-num2);

        StringBuilder  mnojenya = new StringBuilder();
        mnojenya.append(num1).append("*").append(num2).append("=").append(num1*num2);


        System.out.println(dodavanya);
        System.out.println(vidnimanya);
        System.out.println(mnojenya);

        dodavanya.replace(dodavanya.indexOf("="),dodavanya.indexOf("=")+1,"равно");

        vidnimanya.replace(vidnimanya.indexOf("="),vidnimanya.indexOf("=")+1,"равно");

        mnojenya.replace(mnojenya.indexOf("="),mnojenya.indexOf("=")+1,"равно");

        System.out.println(dodavanya);
        System.out.println(vidnimanya);
        System.out.println(mnojenya);
    }
}