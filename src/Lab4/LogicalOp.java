package Lab4;

public class LogicalOp {

    // Tema - Java For Loops

    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100
    public void countUpNumbers(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //2.Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100
    public void countDownNumbers(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    //3.Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,
    public void countBetweenFor(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }

        for (int i = x; i >= y; i--) {
            System.out.println(i);
        }

    }
    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public void countNumbers(int a, int b) {

        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
            if (a > b) {
                for (int i = b; i <= a; i++) System.out.println(i);
            }
        }
    }


    //5.Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100
    public void countEvenNumbers(int number) {
        int n = 100;
        int i = number;
        for (i = 1; i <= n; i++)
            if (i % 2 == 0) {
                System.out.println(i);
            }
    }

    //6.Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100
    public void countUnevenNumbers(int number) {
        int n = 100;
        int i = number;
        for (i = 1; i <= n; i++)
            if (i % 2 != 0) {
                System.out.println(i);
            }
    }

    //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // iar la final sa returneze rezultatul.
    public float getSum(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
        }
        return (int) sum;
    }

    //8.Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // si sa calculeze media numerelor.  La final, metoda sa returneze media.
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

    //1.Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru.
    public void toHundred(int number) {
        int i = number;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    //2.Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru.
    public void downHundred(int number) {
        int i = number;
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,

    public void countInterval(float firstNumber, float secondNumber) {
        while (firstNumber <= secondNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }
    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
    // si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.

    public void countBetween(int firstNumber1, int secondNumber2) {
        if (firstNumber1 < secondNumber2) {
            while (firstNumber1 <= secondNumber2) {
                System.out.println(firstNumber1);
                firstNumber1++;
            }
        } else if (secondNumber2 < firstNumber1) {
            while (secondNumber2 <= firstNumber1) {
                System.out.println(firstNumber1);
                firstNumber1++;
            }
        } else {
            System.out.println("The numbers are equal");
        }
    }

    // 5.Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void showEvenNumbers(int number) {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        }
    }

    //6.Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void showOddNumbers(int number) {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
    }
    //7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda,pentru a numara toate numerele din interval.


    public void getSumAndAverage(int numberFirst, int numberSecond) {
        numberFirst = 111;
        numberSecond = 8899;
        double sum = 0;
        int count = 0;
        while (numberFirst <= numberSecond) {
            sum += numberFirst;
            count++;
            numberFirst++;
            System.out.println(sum);
            double average = sum / count;
            System.out.println(average);
        }
    }

    // 8. Creati o metoda care sa primeasca doi parametrii de tip numar,si sa returneze
    // media numerelor divizibile cu 7, din acel interval.Apelati metoda in clasa Main, metoda main()
    // pentru a verifica daca functioneaza.

    public float divideBySeven(int firstNumber, int lastNumber) {
        float count = 0F;
        float sum = 0F;
        while (firstNumber <= lastNumber) {
            if (firstNumber % 7 == 0) {
                count ++;
                sum += firstNumber;
            }
            firstNumber++;
        }
        float average = sum / count;
        return average;
    }

    //9.Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
    // n2 = n1 + n0
    public void sirulFibonacci() {
        int n1 = 0, n2 = 1, n3, n, n20 = 20;
        System.out.print(n1 + " " + n2);
        n = 2;
        while (n < n20) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            n++;
        }
        System.out.println();
    }
    //10. Creati o metoda numita CozaLozaWoza

    public void printCozaLozaWoza() {
        int i = 1;
        while (i <= 110) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }}