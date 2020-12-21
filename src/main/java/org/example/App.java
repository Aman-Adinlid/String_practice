package org.example;

import java.util.Locale;

public class App {
    public static void main(String[] args) {


        //ex1();
        // ex2();
        // ex3();
//ex4();
        // ex5();
        // ex6();
        // ex7();
        // ex8();
        //  ex9();
        ex10();
    }

    public static void ex1() {
        String test = "Hello Strings";
        System.out.println(test.length());
        System.out.println(test.charAt(0));

        System.out.println("--------------------");

        for (int i = 0; i < test.length(); i++) {

            System.out.println(test.charAt(i));
        }
    }

    public static void ex2() {
        String strings = "Hello Java";
        int index1 = strings.indexOf("llo");
        System.out.println(index1);
        int result = strings.indexOf("Hell", 1);
        System.out.println(result);
    }


    public static void ex3() {

        String greeting = "welcome";
        System.out.println(greeting.substring(3));
        System.out.println(greeting.substring(1, 3));
        System.out.println(greeting.substring(4, 10));
    }


    public static void ex4() {
        String firstName = "Aman";
        System.out.println(firstName.toLowerCase());
        System.out.println(firstName.toUpperCase());
    }

    public static void ex5() {

        String value1 = "dream";
        String value2 = "Dream";
        System.out.println(value1.equals(value2));
        System.out.println(value1.equalsIgnoreCase(value2));

    }

    public static void ex6() {

        String name = "Adam Svensson";
        System.out.println(name.startsWith("Ada"));
        System.out.println(name.endsWith("nsson"));
        System.out.println(name.startsWith("m"));

    }

    public static void ex7() {

        String name = "My Friend";
        System.out.println(name.contains("my"));
        System.out.println(name.contains(""));
        System.out.println(name.contains("Friend"));
    }

    public static void ex8() {

        String text = "abrcdabra";
        System.out.println(text.replace("ab", "*"));
        String text2 = "Hi You";
        System.out.println(text2.replace("", ""));
    }

    public static void ex9() {
        String simple = "Java";
        String str = "Hello";
        System.out.println(simple.trim());
        System.out.println(str.trim());


    }

    public static void ex10() {
        String test = " Welcome to heaven";
        String[] words = test.split(" ");
        for (String word : words) {
            System.out.println(word);

        }
    }
}