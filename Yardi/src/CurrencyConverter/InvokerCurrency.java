package CurrencyConverter;

import java.util.ArrayList;

/**
 * The Class was created to make the Invoker and cleaner the CurrencyConverter class.
 * @author Marcos.
 *
 */
public class InvokerCurrency {
	
	/**
	 * We put the new classes inherited by Currency Interface in a list. It's the producer.
	 * @param idMenuOption
	 * @param amount
	 * @return
	 */
	public ArrayList<Currency> produceCurrencyList(String idMenuOption, Double amount) {
		ArrayList<Currency> currencyList = new ArrayList<>();
        currencyList.add(new CalculateCurrencyUSDToCAD(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyCADToUSD(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyCADToEUR(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyEURToCAD(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyCADToBRL(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyBRLToCAD(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyCADToMXN(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyMXNToCAD(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyCADToKRW(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyKRWToCAD(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyCADToCNY(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyCNYToCAD(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyCADToGBP(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyGBPToCAD(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyCADToPHP(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyPHPToCAD(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyCADToAUD(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyAUDToCAD(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyCADToNZD(idMenuOption, amount));
        currencyList.add(new CalculateCurrencyNZDToCAD(idMenuOption, amount));
        
        return currencyList;
    }
	
	/**
	 * In order to guarantee the Command Design Pattern, the list is executed. It's the consumer.
	 * @param currencyList
	 */
	public void workOffCurrencyList(ArrayList<Currency> currencyList) {
		boolean foundRule = false;
        for (Object currency : currencyList) {
        	if (! foundRule) {
        		foundRule = ((Currency)currency).calculateCurrency();
        	} else {
        		break;
        	}
        }
    }
}
