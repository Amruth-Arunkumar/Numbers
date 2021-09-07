package amruth.in.number;

public class Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int add(int b) {
        return this.number + b;
    }
    public int subtract(int b) {
        return this.number - b;
    }
    public int divide(int b) {
        return (int) this.number / b;
    }
    public int multiply(int b) {
        return this.number * b;
    }

    public int getNumber() {
        return number;
    }
}

