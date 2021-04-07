public class Calculator {

//Ex 1. mutare metode din Main

    public int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }
    public float div(float first, float second) {
        float div = first / second;
        return div;
    }
    public int operation1(int first, int second, int third) {
        int operation1 = first + (second * third);
        return operation1;
    }
    public int modulo1(int first, int second, int third) {
        int modulo1 = (first + second) % third;
        return modulo1;
    }
    public int operation2(int first, int second, int third, int fourth) {
        int operation2 = first + second * third / fourth;
        return operation2;
    }
    public int operation3(int first, int second, int third, int fourth, int fifth, int sixth) {
        int operation3 = first + second / third * fourth - fifth % sixth;
        return operation3;
    }
    public int adunare(int first, int second) {
        int result = first + second;
        return result;
    }
    public float scadere(float first, float second, float third, float fourth) {
        float result = first - second - third - fourth;
        return result;
    }
    public int inmultire(int first, int second, int third, int fourth) {
        int result = first * second * third;
        return result;
    }
    public int impartire(int first, int second) {
        int result = first / second;
        return result;
    }
    public int avg(int first, int second, int third) {
        int result = (first + second + third) / 3;
        return result;
    }
    public int modulo(int first, int second) {
        int modulo = first % second;
        return modulo;
    }
    public float formulaCelsius(float first) {
        float result = 5f/9f * (first - 32f);
        return result;
    }

}