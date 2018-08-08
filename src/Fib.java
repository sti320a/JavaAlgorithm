
public class Fib {
	
	public static int result;
	
	public static void main(String[] args) {
		fib(1, 1000);
	}
	
	private static int fib(int start, int max) {
		result += start;
		if(result>=max) {return 0;}
		System.out.println(result);
		return fib(result, max);
	}

}
