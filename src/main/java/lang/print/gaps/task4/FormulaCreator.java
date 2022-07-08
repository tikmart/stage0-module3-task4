package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {

        float a;
        float b;
        float result;

        a = 3;
        b = 5;
        result =(9 * (float) Math.pow(a,2) - 5*b + 2 + a - 7)*((a + b - 4*a*b)/2);


        System.out.println(result);

    }
}
