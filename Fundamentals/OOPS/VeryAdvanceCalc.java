public class VeryAdvanceCalc extends AdvanceCalc {
    public double power(int n1, int n2) {
        return Math.pow(n1, n2);
    }
}

// this is called multilevel inheritance where veryAdvanceCale -> AdvanceCalc -> Calc
// in this example we have 3 classes
// 1. Calc class which has add and sub method
// 2. AdvanceCalc class which has multiplication and division method
// 3. VeryAdvanceCalc class which has power method