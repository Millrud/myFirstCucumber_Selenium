public class Calculator {

    private double first;
    private double second;
    private double third;
    private double result;

    public void addFirstNumber(double firstNumber) {
        first = firstNumber;
    }

    public void addSecondNumber(double secondNumber) {
        second = secondNumber;
    }

    public void add() {
        result = first + second;
    }

    public void sub() {
        result = first - second;
    }

    public double getResult() {
        return result;
    }


    public void mult() {
        result = first * second;
    }

    public void divide() {
        result = first / second;
    }

    public void addThirdNumber(double thirdNumber) {
        third = thirdNumber;
    }

    public void addThreeNumbers() {
        result = first + second + third;
    }
}
