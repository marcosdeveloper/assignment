package CurrencyConverter;

/**
 * Interface responsible for declaring the method: calculateCurrency in order to the other classes (all of them with the same behavior) implements it.
 * @author Marcos
 *
 */
public interface Currency {
	
	/**
	 * Method responsible for each currency makes their calculus. Each class has its proper way to calculate.
	 */
	void calculateCurrency();
}
