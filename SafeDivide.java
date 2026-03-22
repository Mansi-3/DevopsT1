public class SafeDivide {
    public int divide(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        if(a == 0){
            return 0;
        }
        return a/b;
    }
}
