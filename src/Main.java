import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.concurrent.Callable;
import java.util.Scanner;

public class Main {

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

        Calculator op = new Calculator();
        int add = op.sum(255, 27);
        System.out.println(add);

        Calculator op1 = new Calculator();
        float divide = op1.div(22, 3f);
        System.out.println(divide);

        Calculator op2 = new Calculator();
        int ecuation1 = op2.operation1(-5, 8, 6);
        System.out.println(ecuation1);

        Calculator op3 = new Calculator();
        int modulo = op3.modulo1(55, 9, 9);
        System.out.println(modulo);

        Calculator op4 = new Calculator();
        int ecuation2 = op4.operation2(20, -3, 5, 8);
        System.out.println(ecuation2);

        Calculator op5 = new Calculator();
        int ecuation3 = op5.operation3(5, 15, 3, 2, 8, 3);
        System.out.println(ecuation3);

        Calculator calc = new Calculator();
        int adunare = calc.adunare(27,27);
        System.out.println("Rezultatul este: " + adunare);

        Calculator sub = new Calculator();
        float scadere = sub.scadere (100.5f, 5.25f, 25.5f, 27.2f);
        System.out.println("Rezultatul este: " + scadere);

        Calculator multi = new Calculator();
        int inmultire = multi.inmultire(24, 10, 6, 2);
        System.out.println("Rezultatul este: " + inmultire);

        Calculator div2 = new Calculator();
        int impartire = div2.impartire(2566, 122);
        System.out.println("Rezultatul este: " + impartire);

        printJava();

        Calculator media = new Calculator();
        int average = media.avg(25, 2, 15);
        System.out.println(average);

        printJava2();

        Calculator mod = new Calculator();
        int modulo1 = mod.modulo(20, 6);
        System.out.println("Restul impartirii este: " + modulo1);

        Calculator celsius = new Calculator();
        float C = celsius.formulaCelsius(90f);
        System.out.println("Celsius value is: " + C);

        LogicalOp op6 = new LogicalOp();
        int number = op6.checkBiggerNumber(25, 7);
        System.out.println("The biggest number is: " + number);

        LogicalOp op7 = new LogicalOp();
        String text = op7.EqualText();
        System.out.println(text);

        LogicalOp op8 = new LogicalOp();
        String text1 = op8.NumberText();
        System.out.println(text1);

        LogicalOp op9 = new LogicalOp();
        String number1 = op9.SnowCm();
        System.out.println(number1);

        LogicalOp op10 = new LogicalOp();
        String text2 = op10.EqualOrLower();
        System.out.println(text2);

        LogicalOp op11 = new LogicalOp();
        String text3 = op11.NumberSwitch();
        System.out.println(text3);

        LogicalOp op12 = new LogicalOp();
        String text4 = op12.isNumberEven();
        System.out.println(text4);

        LogicalOp op13 = new LogicalOp();
        String text5 = op13.isEligibleToVote();
        System.out.println(text5);

        LogicalOp op14 = new LogicalOp();
        int number2 = op14.returnBiggerNumber();
        System.out.println(number2);



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

