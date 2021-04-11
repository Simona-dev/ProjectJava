package Lab4;

public class LogicalOp {

    // Tema - Java For Loops
    //1.
    public void countUpNumbers(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //2.
    public void countDownNumbers(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }
    //3.Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,
    // pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.


    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public void countNumbers(int first, int second) {

    }

    //5.
    public void countEvenNumbers(int number) {
        int n = 100;
        int i;
        for (i = 1; i <= n; i++)
            if (i % 2 == 0) {
                System.out.println(i);
            }
    }

    //6.
    public void countUnevenNumbers(int number) {
        int n = 100;
        int i;
        for (i = 1; i <= n; i++)
            if (i % 2 != 0) {
                System.out.println(i);
            }
    }

    //7.
    public float getSum(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
        }
        return (int) sum;
    }

    //8.
    public int getAverage(int number) {
        int sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
            count++;
        }
        return sum / count;
    }

    //9.
    public void printAsterix() {
        for (int i = 1; i <= 7; i++) {
            for (int x = 7; x >= i; x--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

// Tema - Java While Loop

    //1.
    public void toHundred(int number) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    //2.
    public void downHundred(int number) {
        int i = 1;
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,
    // pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void countInterval(int firstnumber, int secondnumber) {
        int first;
        int second;

    }
    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    // 5.
    public void showEvenNumbers(int number) {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }

    //6.
    public void showOddNumbers(int number) {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
    }


//7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
// Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze
// media numerelor din acel interval.
// Introduceti o variabila int count in metoda,
// pentru a numara toate numerele din interval.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

   // public void getSumAndAverage(int numberfirst, int numbersecond) {

       // int sum = 0;
      //  int count = 0;
       // while (numberfirst <= numbersecond) {
           // sum += sum;
           // count++;
           // numberfirst++;
           // System.out.print(sum / count);

        //}
    //}
    // 8. Creati o metoda care sa primeasca doi parametrii de tip numar,
// si sa returneze media numerelor divizibile cu 7, din acel interval.
// Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
//  public int getAverageFromInterval ( int first, int second){
//  int number;


    //9. n2 = n1 + n0
    public void sirulFibonacci() {
        int n1 = 0, n2 = 1, n3, n, n20 = 20;
        System.out.println(n1 + n2);
        n = 2;
        while (n < n20) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            ++n;
        }
    }

    //10. Creati o metoda numita CozaLozaWoza
    public void printCozaLozaWoza() {
        int i = 1;
        boolean text;
        while (i <= 110) {
            text = false;
            if (i % 11 == 0) {
                System.out.println();
            }
            if (i % 3 == 0) {
                System.out.print("Coza");
                text = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                text = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                text = true;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza");
                text = true;
            }
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza");
                text = true;
            }
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza");
                text = true;
            }
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza");
                text = true;
            }
            if (text)
                System.out.print(i);
            i++;
        }
        System.out.print(" ");

        {
            System.out.println();

        }


    }}