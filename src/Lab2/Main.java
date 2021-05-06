package Lab2;

public class Main {
    static int memberVariable1 = 2;
    static int memberVariable2 = 3;

    public static void main(String[] args) {
        int i = multiply(memberVariable1, memberVariable2);
        int ii = divide(memberVariable2,memberVariable1);
        int iii = modulo(10,7);

        System.out.println(i);
        System.out.println(divide(memberVariable2,memberVariable1));
        System.out.println(modulo(10,7));


}
public static int multiply(int first, int second){
        int multiply = first * second;
        return multiply;

}
public static int divide(int second, int first){
        int divide = second / first;
        return divide;

}

public static int modulo(int second, int first) {
        int modulo = second % first;
        return modulo;
}




    }
