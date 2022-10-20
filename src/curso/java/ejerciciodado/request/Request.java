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
        drawMenu("1. Throw a dice\n" +
                "2. Throw five random dices \n" +
                "3. Exit \n");
    }



}
