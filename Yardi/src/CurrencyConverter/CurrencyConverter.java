package CurrencyConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Class responsible for starts the process.
 * @author Marcos
 *
 */
public class CurrencyConverter {
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			System.out.println("Currency Conversions:");
			StringUtils.getOptionList();
			System.out.println("Enter option:");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine().trim();
			
			if (! s.equals("") && StringUtils.isInTheRangeOption(s)) {
				
				System.out.println("Enter amount:");
				String amount = br.readLine().trim();
					
				if (StringUtils.isCurrencyValue(amount)) {
					ArrayList<Currency> list = ListCurrencyUtil.produceCurrencyList(s, Double.parseDouble(amount));
					ListCurrencyUtil.workOffCurrencyList(list);
				} else {
					System.out.println("Invalid Number");
				}
			} else {
				System.out.println("Incorrect menu option " + s);
			}
			
			System.out.println(" ");
		}
	}
}