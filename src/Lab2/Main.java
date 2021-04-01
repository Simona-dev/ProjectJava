package Lab2;

public class Main {
    static int memberVariable1 = 2;
    static int memberVariable2 = 3;

    public static void main(String[] args) {
        int i = multiplication(memberVariable1, memberVariable2);
        int ii = division(memberVariable2,memberVariable1);

                System.out.println(i);
        System.out.println(i);


}
public static int multiplication(int first, int second){
        int multiplication = first * second;
        return multiplication;

}
public static int division(int first, int second){
        int division = second / first;
        return division;

}

public static int modulo(int first, int second) {
        int modulo = second / first;
        return modulo;
}




    }
