package util;

public class CurrencyConverter {
	private static final double IOF = 0.06;
	
	public static double converter(double dollar, double quantity) {
		return (dollar * quantity) + (dollar * quantity * IOF);
	}
}