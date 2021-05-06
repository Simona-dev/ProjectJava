package Lab7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    ReadInput read = new ReadInput();
        System.out.println(read.getInt());
        System.out.println(read.getFloat());
        System.out.println(read.getDouble());
        System.out.println(read.getLong());
        System.out.println(Arrays.toString(read.getArray(5)));

    LogicalOp op = new LogicalOp();
        int[] myArray = {1, 2, 3, 4, 5, 6};
        op.showIndexValue(myArray, 0);
        op.wait(10);



    }

}

