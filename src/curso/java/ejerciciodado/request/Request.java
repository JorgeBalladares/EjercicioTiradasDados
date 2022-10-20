package curso.java.ejerciciodado.request;

import java.util.Scanner;

public class Request {

    public static String requestValue(String texto) {
        System.out.print(texto);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static String requestValue() {
        return requestValue("Insert an option: ");


    }

    public static void drawMenu(String menu) {
        System.out.println(menu);
    }

    public static void drawMenu() {
        drawMenu("1. Roll a dice as many times as you want \n" +
                "2. Roll two dice as many times as you want, show the highest value and its position \n" +
                "3. Exit \n");
    }



}
