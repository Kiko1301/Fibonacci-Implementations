
public class Fibonacci4 {
	static double fibonacci(int n) {
		return (Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((Math.sqrt(5))/2), n))/Math.sqrt(5);
	}

	public static void main(String[] args) {
		int n= 20; //20th Fibonacci number 
			System.out.println(n+ "th fibonacci term:" +Math.round(fibonacci(n)));

	}

}
