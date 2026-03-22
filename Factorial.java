public class Factorial {
    public int factorial(int n){
        if(n<0){
            throw new IllegalArgumentException("Negative number not allowed");
        }
        int result = 1;
        for(int i = 1; i<= n;i++){
            result *=i;
        }
        return result;
    }
}
