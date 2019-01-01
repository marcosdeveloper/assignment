package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between CAD to KRW.
 * @author Marcos
 *
 */
public class CalculateCurrencyCADToKRW implements Currency {
	
	private static final String CADToKRWOption = "9";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyCADToKRW (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public boolean calculateCurrency() {
		if (this.idMenuOption.equals(CADToKRWOption)) {
			System.out.println("You selected CAD to KRW");
			
			System.out.println(amount + " CAD is " + this.amount * 831.57 + " KRW");
		
			return true;
		}
		return false;
	}
	
	public String getIdMenuOption() {
		return idMenuOption;
	}

	public void setIdMenuOption(String idMenuOption) {
		this.idMenuOption = idMenuOption;
	}
	
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
