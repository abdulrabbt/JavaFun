package Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator test1 = new Calculator(15.0,"+",10.5);
        Calculator test2 = new Calculator(44.0,"-",50.0);
        test1.performOperation();
        test2.performOperation();
        test1.getResult();
        test2.getResult();
    }
}
