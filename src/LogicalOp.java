public class LogicalOp {

    // Ex 2.
    public int checkBiggerNumber(int first, int second) {

        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    //Ex 4.
    public String EqualText() {
        String first = "Ana are mere!";
        String second = "FastTrackIT";
        if (first.equals(second)) {
            return "Learning text comparison";
        } else if (!first.equals(second)) ;
        {
            return "Got to try some more";
        }
    }

    // Ex 5.
    public String NumberText() {
        String text = "RealMadrid";
        int number = 7;
        if (text.equals("FastTrackIT") && number <= 3) {
            return (text + number);
        } else if (!text.equals("FastTrackIT") && number >= 4) {
            return (number + text);

        }
        return null;
    }

    // Ex 6.
    public String SnowCm() {
        int number = 23;
        if (number == 6 || number > 8) {
            return ("The amount of snow this winter was: " + number + "cm");
        } else {
            System.out.println("The forecast snow is (cm) " + number);
        }
        return " ";
    }

    // Ex 7.
    public String EqualOrLower() {
        float number = 3.45f;
        if (number > 3f && number != 4f) {
            return ("The number is greater than 3 and not equal to 4");
        } else if (number == 4f) {
            return ("The number is equal to 4f");
        } else if (number < 3f) return ("The number is lower than 3");
        return "";
    }

    // Ex 8.
    public String NumberSwitch() {
        int number = 5; // (int number = 1 to 9)
        switch (number) {
            case 1:
                System.out.println("The number is : 1");
                break;
            case 2:
                System.out.println("The number is : 2");
                break;
            case 3:
                System.out.println("The number is : 3");
                break;
            case 4:
                System.out.println("The number is : 4");
                break;
            case 5:
                System.out.println("The number is : 5");
                break;
            case 6:
                System.out.println("The number is : 6");
                break;
            case 7:
                System.out.println("The number is : 7");
                break;
            case 8:
                System.out.println("The number is : 8");
                break;
            case 9:
                System.out.println("The number is : 9");
                break;
            case 10:
                System.out.println("The number is : 10");
                break;
        }
        return " ";
    }

    //Ex 9.
    public String isNumberEven() {
        int number = 6;
        if (number % 2 == 0) {
            return ("True");
        } else if (number % 2 != 0) {
            return ("False");
        }
        return "";
    }

    //Ex 10.
    public String isEligibleToVote() {
        int age = 31;

        if (age >= 18) {
            System.out.println("True");
        } else System.out.println("False");
        return "";
    }

    //Ex 11.
    public int returnBiggerNumber() {
        int first = 1;
        int second = 2;
        int third = 3;
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else return third;

    }
}

















