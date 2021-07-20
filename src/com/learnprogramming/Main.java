package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
        char switchValue = ' ';

        switch (switchValue) {
            case 'A':
                System.out.println("Found A");
                break;

            case 'B':
                System.out.println("Found B");
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println("Found " + switchValue);
                break;

            default:
                System.out.println("Not found");
        }

        String month = "jUne";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }

}
