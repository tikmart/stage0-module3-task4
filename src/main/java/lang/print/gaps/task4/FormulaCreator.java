package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {

        int a;
        int b;
        float firstBracket;
        float secondBracket;
        float result;

        a = 3;
        b = 5;
        firstBracket =9 * (float) Math.pow(a,2) - 5*b + 2 + a - 7;
        secondBracket = (a + b - 4 * a * b) / 2;

        result = firstBracket * secondBracket;

        System.out.println(result);

    }
}
