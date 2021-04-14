package Lab5;

public class Calculator {

// Ex1. Polimorphism
    public int adunare(int first, int second) {
        int result = first + second;
        return result;
    }
    public int adunare(int first, int second, int third) {
        int result = first + second + third;
        return result;
    }
    public float adunare ( float first, float second, float third){
            float result = first + second + third;
            return result;
    }
    public static float scadere ( float first, float second, float third, float fourth){
            float result = first - second - third - fourth;
            return result;
    }
    public static float scadere ( float first, float second){
            float result = first - second;
            return result;
    }
    public static int scadere ( int first, int second) {
        int result = first - second;
        return result;
    }
    public static int multiply ( int first, int second){
            int result = first * second ;
            return result;
    }
    public static int multiply ( int first, int second, int third){
        int result = first * second * third;
        return result;
    }
    public static float multiply ( float first, float second){
        float result = first * second ;
        return result;
    }
    public static int divide ( int first, int second) {
        int divide = second / first;
        return divide;
    }
    public static int divide ( int second, int first, int third){
        int divide = second / first / third;
        return divide;
    }
    public static float divide ( float second, float first){
        float divide = second / first;
        return divide;
    }
    public static int modulo ( int second, int first){
        int modulo = second % first;
        return modulo;
    }
    public static float modulo ( float second, int first){
        float modulo = second % first;
        return modulo;
    }
    public int avg(int first, int second) {
        int result = (first + second ) / 2;
        return result;
    }
    public int avg(int first, int second, int third) {
        int result = (first + second + third) / 3;
        return result;
    }
    public float avg(float first, int second, int third) {
        float result = (first + second + third) / 3;
        return result;
    }



    }



