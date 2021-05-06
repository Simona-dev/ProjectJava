package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogicalOp {

    private Object List;


    // Ex1. Scrieti o metoda Java, care sa primeasca parametru o Lista,
    // si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.

    public void printList(List<String> list) {
        int i;
        for (i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    // Ex2. Scrieti o metoda Java, care sa primeasca doi parametrii:
    // un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
    // Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addNumberToList(List<Integer> list, int number) {
        list.add(number);
        System.out.println(list);
    }
    //Ex3. Scrieti o metoda Java, care sa primeasca doi parametrii:
    // un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void indexList(List<String> list, int number) {
        for (int i = number; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    //Ex4. Scrieti o metoda Java, care sa primeasca parametru o Lista,
    // si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).

    public void reverseOrderList(List<Integer> list) {
        //Collections.reverse(list);
        //System.out.println(list);
        for (int i = list.size() - 1; i > 0; i--) {
            System.out.println(list.get(i));
        }
    }
    //Ex5. Scrieti o metoda Java, care sa primeasca trei parametrii:
    // unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
    // Metoda sa adauge parametrul de tip String in lista primita,
    // iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void Three_Parameters(List<String> listString, int number, String text) {
        listString.add(number, text);
        System.out.println(listString);
    }
    //Ex6. Scrieti o metoda Java, care sa primeasca doi parametrii.
    // Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru
    // si sa il adauge pe prima pozitie din lista.

    public void firstIndexParameter(List<Integer> integerList, int number) {
    integerList.add(0, number);
    System.out.println(integerList);

    }
    //Ex7. Scrieti o metoda Java care sa primeasca parametru o Lista,
    // si sa afiseze ce valori are lista, si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).

    public void getIndexAndValue(List<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            System.out.println("Pe pozitia " + i + " valoarea este " + list.get(i));

        }}
    public void getIndexAndValue2(List<String> list){
            for (int i = 0; i< list.size(); i++){
                System.out.println("Pe pozitia " + i + " valoarea este " + list.get(i));
        }}

    //Ex8. Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public int getBiggerNumberList(List<Integer> list) {
        int biggerNumber = 0;
        for (int i  = 1; i < list.size(); i++) {
            if (biggerNumber < list.get(i)) {
                biggerNumber = list.get(i);
            }
        }
        return biggerNumber;
    }

    }




