package CurrencyConverter;

import java.util.ArrayList;

/**
 * This class helps with the options list when starts the process and there are some methods to work with Strings which validates the Strings.
 * @author Marcos.
 *
 */
public class StringUtils {
	
	private static final String USD_CAD = "1 - USD to CAD";
	private static final String CAD_USD = "2 - CAD to USD";
	private static final String CAD_EUR = "3 - CAD to EUR";
	private static final String EUR_CAD = "4 - EUR to CAD";
	private static final String CAD_BRL = "5 - CAD to BRL";
	private static final String BRL_CAD = "6 - BRL to CAD";
	private static final String CAD_MXN = "7 - CAD to MXN";
	private static final String MXN_CAD = "8 - MXN to CAD";
	private static final String CAD_KRW = "9 - CAD to KRW";
	private static final String KRW_CAD = "10 - KRW to CAD";
	private static final String CAD_CNY = "11 - CAD to CNY";
	private static final String CNY_CAD = "12 - CNY to CAD";
	private static final String CAD_GBP = "13 - CAD to GBP";
	private static final String GBP_CAD = "14 - GBP to CAD";
	private static final String CAD_PHP = "15 - CAD to PHP";
	private static final String PHP_CAD = "16 - PHP to CAD";
	private static final String CAD_AUD = "17 - CAD to AUD";
	private static final String AUD_CAD = "18 - AUD to CAD";
	private static final String CAD_NZD = "19 - CAD to NZD";
	private static final String NZD_CAD = "20 - NZD to CAD";
	
	/**
	 * Responsible for delivery the list of options when the process starts.
	 */
	public static void getOptionList () {
		ArrayList<String> optionList = new ArrayList<>();
		optionList.add(USD_CAD);
		optionList.add(CAD_USD);
		optionList.add(CAD_EUR);
		optionList.add(EUR_CAD);
		optionList.add(CAD_BRL);
		optionList.add(BRL_CAD);
		optionList.add(CAD_MXN);
		optionList.add(MXN_CAD);
		optionList.add(CAD_KRW);
		optionList.add(KRW_CAD);
		optionList.add(CAD_CNY);
		optionList.add(CNY_CAD);
		optionList.add(CAD_GBP);
		optionList.add(GBP_CAD);
		optionList.add(CAD_PHP);
		optionList.add(PHP_CAD);
		optionList.add(CAD_AUD);
		optionList.add(AUD_CAD);
		optionList.add(CAD_NZD);
		optionList.add(NZD_CAD);
		
		for (String option : optionList) {
			System.out.println(option);
		}
	}
	
	/**
	 * This method checks if the typed number is between 1 and 20 (the total of options when the process runs). Use of Regex.
	 * @param option
	 * @return
	 */
	public static boolean isInTheRangeOption (String option) {
		boolean isInTheRangeOption = false;
		if (option.matches("^(2[0]|1[0-9]|[1-9])$")) {
			isInTheRangeOption = true;
		}
		return isInTheRangeOption;
	}
	
	/**
	 * This method checks if the value put in "amount" is correct. Don't have letters and other unforeseen characters.
	 * @param option
	 * @return
	 */
	public static boolean isCurrencyValue (String option) {
		boolean isCurrencyValue = false;
		if (option.matches("^[0-9]*[.]{0,1}[0-9]*$")) {
			isCurrencyValue = true;
		}
		return isCurrencyValue;
	}
}
