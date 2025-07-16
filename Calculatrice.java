public class Calculatrice {
    public int addition(int a, int b) {
        return a + b;
    }
    
    public int division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro !");
        }
        return a / b;
    }

}
