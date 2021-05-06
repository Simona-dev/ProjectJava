package Lab6;

import java.util.ArrayList;
import java.util.List;

public class LogicalOp2 {

    public List<Integer> setValueInList() {
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            x.add(i);
        }
        return x;
    }
    // Ex1. Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista,
    public List<Integer > changeIndexList(List<Integer> list){
//        System i = list.indexOf(5);
//        list.set(2);

        System.out.println(list);

        return list;
    }


    // Ex2. Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista,
    // care sa contina doar numerele pare din lista primita.
    public List<Integer> listEvenNumber(List<Integer> firstList){
        List<Integer> secondList = new ArrayList<>();
        for(int i = 0; i<firstList.size(); i++){
            if(firstList.get(i) % 2==0){
                int number = firstList.get(i);
                secondList.add(number);
            }
        }
        return secondList;
    }


    // Ex3. Scrieti o metoda Java care sa primeasca parametru o Lista nesortata,
    // si sa returneze Lista sortata crescator.
    // Atentie, sortarea sa se faca programatic(adica logica sa fie scrisa de voi),
    // si nu folosit librarie externa, precum Collection.sort().
}
