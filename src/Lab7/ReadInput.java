package Lab7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class ReadInput {
    // Ex1. In clasa Read, din programul vostru, creati o metoda tratat,
    // care sa returneze un numar de la tastatura.

    public int getInt() {
        int numberFromUser = 0;
        boolean repeat = false;
        do {
            System.out.print("Enter a number: ");
            try {
                Scanner scan = new Scanner(System.in);
                numberFromUser = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException NAN) {
                repeat = true;
                System.out.println("Invalid provided value. NAN!");
            }
        } while (repeat == true);
        return numberFromUser;

    }
    // Ex2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
    // care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)

    public float getFloat() {
        float numberFromUser = 0f;
        boolean repeat = false;
        do {
            System.out.print("Enter a number: ");
            try {
                Scanner scan = new Scanner(System.in);
                numberFromUser = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException NAN) {
                repeat = true;
                System.out.println("Invalid provided value. NAN!");
            }
        } while (repeat == true);
        return numberFromUser;

    }

    public double getDouble() {
        double numberFromUser = 0D;
        boolean repeat = false;
        do {
            System.out.print("Enter a number: ");
            try {
                Scanner scan = new Scanner(System.in);
                numberFromUser = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException NAN) {
                repeat = true;
                System.out.println("Invalid provided value. NAN!");
            }

        } while (repeat == true);
        return numberFromUser;
    }

    public long getLong() {
        long numberFromUser = 0L;
        boolean repeat = false;
        do {
            System.out.println("Enter a number: ");
            try {
                Scanner scan = new Scanner(System.in);
                numberFromUser = scan.nextLong();
                repeat = false;
            } catch (InputMismatchException NAN) {
                repeat = false;
                System.out.println("Invalid provided value. NAN!");
            }

        } while (repeat == true);
        return numberFromUser;
    }
    // Ex3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
    // Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public int[] getArray(int index) {
        int[] array = new int[index];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < index; i++) {
            System.out.println("Enter a number: ");
            array[i] = input.nextInt();
        }
        return array;
    }
    //Ex4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
    // Metoda nu va primii parametru lungimea.
    // In rezolvarea ei trebuie folosit try-catch.
    // (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)
    public List<Integer> getArrayList(){
        List<Integer> myList = new ArrayList<>();
        Scanner input = new Scanner(System.in);


     return myList;
    }


}





