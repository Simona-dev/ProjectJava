package Lab6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("Monday");
        myList.add("Tuesday");
        myList.add("Wednesday");
        myList.add("Thursday");
        myList.add("Friday");
        myList.add("Saturday");
        myList.add("Sunday");

        List <Integer> myNumber = new ArrayList<>();
        myNumber.add(11);
        myNumber.add(27);
        myNumber.add(3);
        myNumber.add(54);
        myNumber.add(5);
        myNumber.add(36);
        myNumber.add(17);

        LogicalOp op = new LogicalOp();
//        op.printList(myList);
//        op.indexList(myList, 2);
//        op.addNumberToList(myNumber, 301);
//        op.reverseOrderList(myNumber);
//        op.Three_Parameters( myList, 0, "Weekdays are: ");
//        op.firstIndexParameter(myNumber, 101);
//        op.getIndexAndValue(myNumber);
//        op.getIndexAndValue2(myList);
//        System.out.println(op.getBiggerNumberList(myNumber));


         LogicalOp2 op2 = new LogicalOp2();
        List<Integer> myIntList = op2.setValueInList();
        //op2.changeIndexList();
        System.out.println(op2.listEvenNumber(myIntList));







        









    }


}
