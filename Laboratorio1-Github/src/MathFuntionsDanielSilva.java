public class MathFuntionsDanielSilva {

    /**
     * Calculates the nth Fibonacci number.
     *
     * @param n the index of the Fibonacci number to calculate
     * @return the nth Fibonacci number
     */
    public static int fibN(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibN(n-1) + fibN(n-2);
    }
}
