package Methods;

public class factorialMethod {

	public static int factorial(int num) {
		int result = 1;
		for(int i = 1; i <= num; ++i) {
			result = result * i;
		}
		return result;
	}

}
