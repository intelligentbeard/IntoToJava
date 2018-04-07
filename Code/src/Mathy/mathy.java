package Mathy;

public class mathy {
	
	public static double power(double num, double power) {
		double result = 0;
		if (power == 0) {
			result = 1;
		}
		else if(power > 0) {
			result = 1;
			for (long i = 0; i < power; ++i) {
				result = result*num;
			}
		}
		else if(power < 0) {
			result = 1;
			for (long i = 0; i > power; --i) {
				result = result*num;
			}
			result = 1/result;
		}
		return result;
	}
	
	
}
