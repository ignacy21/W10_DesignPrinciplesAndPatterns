package zĆwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String whatever = """
                String fajna sprawa,
                a ciekawe co się stanie jeżeli
                zrobimy tak: ""\" o hoho chyba 
                tak to się powinno zrobić, a 
                może spróbujemy tak: \"""
                git
                """;
        System.out.println(whatever);

        while (sc.hasNext()) {
            String next = sc.next();
            System.out.println(next.length());
            System.out.println(next);
            if ("\\\\".equals(next)) {
                break;
            }
        }
    }
}
