package curso.java.ejerciciodado.dice;

import curso.java.ejerciciodado.request.Request;

import java.util.Arrays;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {

        int opcion=0;
        do {
            Request.drawMenu();
            opcion = Integer.parseInt(Request.requestValue());
            switch (opcion) {
                case 1 -> throwDice();
                case 2 -> throw2Dices();
                case 3 -> System.out.println("BYE!");
                default -> System.out.println("\nOption not allowed\n");
            }
        }while(opcion!=3);
    }

    public static void throwDice (){
        int value = Integer.parseInt(Request.requestValue("Insert number of repetition to throw a dice: "));
        int[] result = new int[value];

        for (int i = 0; i < value; i++){
            int throwDice = (int)(Math.random()*6 + 1);
            result[i] = throwDice;
        }
        System.out.print("\nAll results have been: " + Arrays.toString(result));

        int minValue = 6;
        for (int i = 0; i < value; i++){
            if(minValue > result [i]){
                minValue = result[i];
            }
        }
        System.out.println("\nthe minimum value is: " + minValue);

        int maxValue = 1;
        for (int i = 0; i < value; i++){
            if(maxValue < result [i]){
                maxValue = result[i];
            }
        }
        System.out.println("the maximum value is: " + maxValue);

        int val = 0;
        for (int i = 0; i < value; i++){
            val += result[i];
        }
        int media = val/value;
        System.out.println("the media value is: " + media+"\n");
    }
    public static void throw2Dices(){
        int throwsDices = Integer.parseInt(Request.requestValue("Insert number of repetition to throw two dices: "));
        int[] result_1 = new int[throwsDices];
        int[] result_2 = new int[throwsDices];
        for (int i = 0; i < throwsDices; i++){
            int throwDice = (int)(Math.random()*6 + 1);
            result_1[i] = throwDice;
        }
        for (int i = 0; i < throwsDices; i++){
            int throwDice = (int)(Math.random()*6 + 1);
            result_2[i] = throwDice;
        }

        int [][] result = new int[2][throwsDices];
        for (int i = 0; i < throwsDices; i++){
            for (int j = 0; j < throwsDices; j++){
                if(result[0][j] == 0 ){
                    result[0][j] = result_1[j];
                }
                if(result[1][j] == 0 ){
                    result[1][j] = result_2[j];
                }
            }
        }

        int value = 0;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < throwsDices; j++){
                if(value<result[i][j]){
                    value = result[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
        System.out.println("the maximum value is: " + value);
    }
}
