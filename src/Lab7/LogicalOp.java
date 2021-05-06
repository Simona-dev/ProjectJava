package Lab7;

public class LogicalOp {

    //Ex5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
    // Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
    // iar daca valoarea numarului este mai mare decat numarul de pozitii din array,
    // afisati textul: "Inside catch, number too large".
    public void showIndexValue(int[] array, int number){

        try {
            System.out.println("The value from index is: " + array[number]);

        } catch (ArrayIndexOutOfBoundsException easdasd) {

            System.out.println("Inside catch, number too large.");
        }
    }


//Ex6. In clasa LogicalOp, creati o metoda  'wait()'. Metoda sa nu returneze nimic,
// dar sa primeasca un parametru de tip int. In interiorul ei, tratati metoda Thread.sleep(),
// astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte.
// Ex: wait(5) -> asteapta 5 secunde.

    public  void wait(int number)  {
        System.out.println("Hello!");
        try { Thread.sleep(number);

        } catch (Exception exception) {
            ;
        }
        System.out.println("Bye");
}}
