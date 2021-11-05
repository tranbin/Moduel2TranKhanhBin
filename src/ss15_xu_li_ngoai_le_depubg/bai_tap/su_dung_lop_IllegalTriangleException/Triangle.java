package ss15_xu_li_ngoai_le_depubg.bai_tap.su_dung_lop_IllegalTriangleException;

public class Triangle {
    private double canhA;
    private double canhB;
    private double canhC;

    public Triangle(double canhA, double canhB, double canhC) throws IllegalTriangleException {
        if (canhA <= 0 || canhB <= 0 || canhC <= 0) {
            throw new IllegalTriangleException("Invaid side: tam giac ko the co 1 canh nho hon 0");
        }

        if (canhA + canhB < canhC || canhA + canhC < canhB || canhB + canhC < canhA) {
            throw new IllegalTriangleException("tam giac ko the co tong 2 canh nho hon 1 canh");
        }
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public double perimeter() {
        return canhA + canhB + canhC;
    }
}
