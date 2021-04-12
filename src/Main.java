public class Main {
// Lab2 and Lab3
    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World!");
        System.out.println("Hello");
        System.out.println("Simona");
        System.out.println(255 + 27);
        System.out.println(22 / 3f);
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        printMyname("Simona");

        Calculator1 op = new Calculator1();
        int add = op.sum(255, 27);
        System.out.println(add);

        Calculator1 op1 = new Calculator1();
        float divide = op1.div(22, 3f);
        System.out.println(divide);

        Calculator1 op2 = new Calculator1();
        int ecuation1 = op2.operation1(-5, 8, 6);
        System.out.println(ecuation1);

        Calculator1 op3 = new Calculator1();
        int modulo = op3.modulo1(55, 9, 9);
        System.out.println(modulo);

        Calculator1 op4 = new Calculator1();
        int ecuation2 = op4.operation2(20, -3, 5, 8);
        System.out.println(ecuation2);

        Calculator1 op5 = new Calculator1();
        int ecuation3 = op5.operation3(5, 15, 3, 2, 8, 3);
        System.out.println(ecuation3);

        Calculator1 calc = new Calculator1();
        int adunare = calc.adunare(27,27);
        System.out.println("Rezultatul este: " + adunare);

        Calculator1 sub = new Calculator1();
        float scadere = sub.scadere (100.5f, 5.25f, 25.5f, 27.2f);
        System.out.println("Rezultatul este: " + scadere);

        Calculator1 multi = new Calculator1();
        int inmultire = multi.inmultire(24, 10, 6, 2);
        System.out.println("Rezultatul este: " + inmultire);

        Calculator1 div2 = new Calculator1();
        int impartire = div2.impartire(2566, 122);
        System.out.println("Rezultatul este: " + impartire);

        printJava();

        Calculator1 media = new Calculator1();
        int average = media.avg(25, 2, 15);
        System.out.println(average);

        printJava2();

        Calculator1 mod = new Calculator1();
        int modulo1 = mod.modulo(20, 6);
        System.out.println("Restul impartirii este: " + modulo1);

        Calculator1 celsius = new Calculator1();
        float C = celsius.formulaCelsius(90f);
        System.out.println("Celsius value is: " + C);

        LogicalOp1 op6 = new LogicalOp1();
        int number = op6.checkBiggerNumber(25, 7);
        System.out.println("The biggest number is: " + number);

        LogicalOp1 op7 = new LogicalOp1();
        System.out.println(op7.EqualText("Ana are mere!","FastTrackIT"));

        LogicalOp1 op8 = new LogicalOp1();
        System.out.println(op8.NumberText("RealMadrid", 7));

        LogicalOp1 op9 = new LogicalOp1();
        System.out.println(op9.SnowCm(23));

        LogicalOp1 op10 = new LogicalOp1();
        System.out.println(op10.EqualOrLower(3.45f));

        LogicalOp1 op11 = new LogicalOp1();
        System.out.println(op11.NumberSwitch(9));

        LogicalOp1 op12 = new LogicalOp1();
        System.out.println(op12.isNumberEven(4));

        LogicalOp1 op13 = new LogicalOp1();
        System.out.println(op13.isEligibleToVote(31));


        LogicalOp1 op14 = new LogicalOp1();
        System.out.println(op14.returnBiggerNumber(1, 2,3));




    }




    public static void printMyname(String name)
    { System.out.println("Hello " + name);}

    public static void printJava() {
        System.out.println("        J     a   v     v   a     ");
        System.out.println("        J    a a   v   v   a a    ");
        System.out.println("     J  J   aaaaa   V V   aaaaa   ");
        System.out.println("      JJ   a     a   V   a     a  ");
    }
    public static void printJava2() {
        System.out.println(" + \" \" \" \" \" + ");
        System.out.println("  [|  o o  |]");
        System.out.println("   |   ^   | ");
        System.out.println("   |  '-'  | ");
        System.out.println("   +-------+ ");

    }


}

