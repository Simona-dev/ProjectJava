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

        int add = sum(255, 27);
        System.out.println(add);

        float divide = div(22, 3f);
        System.out.println(divide);

        int ecuation1 = operation1(-5, 8, 6);
        System.out.println(ecuation1);

        int modulo = modulo1(55, 9, 9);
        System.out.println(modulo);

        int ecuation2 = operation2(20, -3, 5, 8);
        System.out.println(ecuation2);

        int ecuation3 = operation3(5, 15, 3, 2, 8, 3);
        System.out.println(ecuation3);

        String text = "Rezultatul este: ";
        System.out.println(text + adunare(27, 27));
        System.out.println(text + scadere(100.5f, 5.25f, 25.5f, 27.2f));
        System.out.println(text + inmultire(24, 10, 6, 2));
        System.out.println(text + impartire(2566, 122));
        printJava();

        int average = avg(25, 2, 15);
        System.out.println(average);

        printJava2();

        String text2 = "Restul impartirii este: ";
        System.out.println(text2 + modulo(20, 6));

        float C = formulaC(90f);
        System.out.println(C);

    }


    public static void printMyname(String name) {
        System.out.println("Hello " + name);
    }

    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static float div(float first, float second) {
        float div = first / second;
        return div;
    }

    public static int operation1(int first, int second, int third) {
        int operation1 = first + (second * third);
        return operation1;
    }

    public static int modulo1(int first, int second, int third) {
        int modulo1 = (first + second) % third;
        return modulo1;
    }

    public static int operation2(int first, int second, int third, int fourth) {
        int operation2 = first + second * third / fourth;
        return operation2;
    }

    public static int operation3(int first, int second, int third, int fourth, int fifth, int sixth) {
        int operation3 = first + second / third * fourth - fifth % sixth;
        return operation3;
    }

    public static int adunare(int first, int second) {
        int result = first + second;
        return result;
    }

    public static float scadere(float first, float second, float third, float fourth) {
        float result = first - second - third - fourth;
        return result;
    }

    public static int inmultire(int first, int second, int third, int fourth) {
        int result = first * second * third;
        return result;
    }

    public static int impartire(int first, int second) {
        int result = first / second;
        return result;
    }

    public static void printJava() {
        System.out.println("        J     a   v     v   a     ");
        System.out.println("        J    a a   v   v   a a    ");
        System.out.println("     J  J   aaaaa   V V   aaaaa   ");
        System.out.println("      JJ   a     a   V   a     a  ");
    }

    public static int avg(int first, int second, int third) {
        int result = (first + second + third) / 3;
        return result;
    }

    public static void printJava2() {
        System.out.println(" + \" \" \" \" \" + ");
        System.out.println("  [|  o o  |]");
        System.out.println("   |   ^   | ");
        System.out.println("   |  '-'  | ");
        System.out.println("   +-------+ ");

    }

    public static int modulo(int first, int second) {
        int modulo = first % second;
        return modulo;

    }

    public static float formulaC(float first) {
        float result = 5f/9f * (first - 32f);
        return result;
    }
}

