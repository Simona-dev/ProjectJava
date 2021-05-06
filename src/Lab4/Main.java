package Lab4;


public class Main {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();
        int i = 1;
        op.countUpNumbers(35);
        op.countDownNumbers(-23);
        op.countBetweenFor(2,6);
        op.countNumbers(24,2);
        op.countEvenNumbers(1);
        op.countUnevenNumbers(1);
        System.out.println(op.getSum(5));
        System.out.println(op.getAverage(5));
        op.printAsterix();
        op.toHundred(1);
        op.downHundred(10);
        op.countInterval(1,58);
        op.countBetween(22,56);
        op.showEvenNumbers(1);
        op.showOddNumbers(1);
        op.getSumAndAverage(111,8899);
        op.divideBySeven(10,22);
        op.sirulFibonacci();
        op.printCozaLozaWoza();

    }
}