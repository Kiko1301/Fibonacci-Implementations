
	public class Fibonacci2 {
	    public static void main(String[] args) {
	        int n = 10; // example value for n
	        int result = fib(n);
	        System.out.println("The " + n + "-th Fibonacci number is: " + result);
	    }

	    public static int fib(int n) {
	        int[] fibArr = new int[n + 1];
	        fibArr[0] = 0;
	        fibArr[1] = 1;
	        for (int i = 2; i <= n; i++) {
	            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
	        }
	        return fibArr[n];
	    }
	}
