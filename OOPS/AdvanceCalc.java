public class AdvanceCalc extends Calc {
    public int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    public int division(int n1, int n2) {
        return n1 / n2;
    }
}

// this is called single level inheritance where AdvanceCalc derived from class Calc
// in this example we have 2 classes
// 1. Calc class which has add and sub method
// 2. AdvanceCalc class which has multiplication and division method