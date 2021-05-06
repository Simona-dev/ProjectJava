package Lab5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*
    //Ex 1 Polimorphism
       Calculator op = new Calculator();
        System.out.println(op.adunare(2,3));
        System.out.println(op.adunare(1,2,3));
        System.out.println(op.adunare(2.4f,3.2f,5.0f));
        System.out.println(op.scadere (20,5,6,2));
        System.out.println(op.scadere(78,56));
        System.out.println(op.scadere(33f,15f));
        System.out.println(op.multiply(2,6));
        System.out.println(op.multiply(2,4,8));
        System.out.println(op.multiply (34f,15f));
        System.out.println(op.divide(20,100));
        System.out.println(op.divide(100,27,2));
        System.out.println(op.divide(55f,11f));
        System.out.println(op.modulo(10,7));
        System.out.println(op.modulo(10f,7));
        System.out.println(op.avg(20,5));
        System.out.println(op.avg(20f,5,6));
        System.out.println(op.avg(20,5,6));
*/
    //2.
        int [] array = new int[100];
        LogicalOp logicalOp = new LogicalOp();
        logicalOp.array_init(array);
        logicalOp.printArray(array);

    //3.
        int [] myArr; // = new int[50];
        myArr = logicalOp.evenArray(array);
        logicalOp.printArray(myArr);
        int [] myArr1 = new int[50];
        myArr1 = logicalOp.evenArray1(myArr1);
        logicalOp.printArray(myArr1);


        //4.
        int[] myArray2 = new int[10];
        for (int i = 0; i<10; i++){
            myArray2[i] = i + 1 ;
        }
        System.out.println(logicalOp.getAverageFromArray(myArray2));
    //5.
        String[] array2 = new String[5];
        array2[0]= "Scooter";
        array2[1]= "Car";
        array2[2]= "Bike";
        array2[3]= "Train";
        array2[4]= "Motor";
        System.out.println(logicalOp.isInArray(array2, "Bike"));
    //6.
        int[] array3 = {10, 15, 4, 7, 27, 45, 100};
        int valueToFind ;
        System.out.println(logicalOp.verifyNumberIndex(array3,100));
    //7.
        logicalOp.printFormLines();
        logicalOp.printFormValue(array, 10);
    //8.
        logicalOp.printArray(array);
        array = logicalOp.returnArray(array, 10);
        logicalOp.printArray(array);

    //9.
        int second_smallest = 0;
        logicalOp.printArray(array);
        second_smallest = logicalOp.secondSmallest(array);
        System.out.printf("Second Smallest is: " + second_smallest);












    }


    }
