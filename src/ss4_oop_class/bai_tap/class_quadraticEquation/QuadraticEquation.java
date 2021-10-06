package ss4_oop_class.bai_tap.class_quadraticEquation;

public class QuadraticEquation {
    private double numA, numB, numC;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double numA, double numB, double numC) {
        this.numA = numA;
        this.numB = numB;
        this.numC = numC;
    }

    public double getNumA() {
        return this.numA;
    }

    public double getNumB() {
        return this.numB;
    }

    public double getNumC() {
        return this.numC;
    }

    public double getDiscriminant() {
        return (Math.pow(this.numB, 2) - (4 * this.numA * this.numC));
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return -this.numB + Math.pow(getDiscriminant(), 0.5) / this.numA * 2;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return -this.numB - Math.pow(getDiscriminant(), 0.5) / this.numA * 2;
        }
    }

}
