package Lab5;

import java.util.Arrays;

public class LogicalOp {
    LogicalOp() {
        // array = new int[100];
    }

    //Ex 2. In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii,
    // valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public void array_init(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
    }
    public void printArray(int[] array) {
         for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
    //Ex 3. Creati o metoda care sa primeasca un parametru de tip array de numere intregi gol,
    // si sa il returneze populat cu toate valorile pare de la 1 la 100.
    // Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.

    public int[] evenArray(int[] full_array) {
        int[] even_array = new int[50];
        int j = 0;
        for (int i=0; i < full_array.length; i++) {
            if (full_array[i] % 2 == 0) {
                even_array[j] = full_array[i];
                j++;
            }
        }
        return even_array;
    }

    public int[] evenArray1(int[] full_array) {
        full_array = new int[50];
        for (int i = 2; i<=100; i = i + 2) {
            full_array[i/2 - 1] = i;
        }
        return full_array;
    }


// 4. Creati o metoda care sa primeasca un parametru de tip array de numere,
// si sa fie populat cu valori. Metoda sa calculeze si sa returneze media numerelor din array.
// Apelati metoda in main() pentru a verifica daca functioneaza.

   public double getAverageFromArray(int[]array){
       double sum = 0;
       for (int i = 0; i < array.length; i++) {
           sum = sum + array[i];
       }
       return sum / array.length;
   }
    //Ex 5. Creati o metoda care sa primeasca un parametru de tip array de string-uri,
    // populat cu valori, si un parametru de tip String.
    // Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit,

    public boolean isInArray(String[] array, String text) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(text))
                return true;
        }
        return false;
    }
    // Ex 6. Creati o metoda care sa primeasca un parametru de tip array de numere,
    // populat cu valori, si un parametru de tip numar.
    // Metoda sa verifice daca numarul primit se afla in array-ul primit,
    // si daca da, atunci sa returneze pozitia pe care se afla numarul.

    public int verifyNumberIndex(int[] array, int number) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == number)
                return i;
        }
        return -1;
    }

    //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
    public void printFormLines() {
        //int[][] array = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(/*array[i][j] +*/ "-");
            }
            System.out.println();
        }
    }
    public void printFormValue(int[] array, int line_size) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
            if ((i + 1) % line_size == 0) {
                System.out.println();
            }
        }
    }
    // 8. Creati o metoda care sa primeasca un parametru de tip array de numere,
    // populat cu valori, si un parametru de tip numar.
    // Metoda sa verifice daca numarul exista in array, si daca da,
    // sa returneze array-ul primit, fara acel numar.
    public int[] returnArray (int[] array, int number) {
        int[] my_array;
        int j = 0, found = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = 1;
                break;
            }
        }
        if (found == 1) {
            my_array = new int[array.length - 1];
        } else {
            my_array = new int[array.length];
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                // do nothing
            } else {
                my_array[j] = array[i];
                j++;
            }
        }
        return my_array;
    }

// 9.

    public int secondSmallest (int[] array) {
        Arrays.stream(array).sorted();
        return array[1];
    }
}



