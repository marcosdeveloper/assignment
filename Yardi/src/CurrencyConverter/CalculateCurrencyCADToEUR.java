package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between CAD to EUR.
 * @author Marcos
 *
 */
public class CalculateCurrencyCADToEUR implements Currency {
	
	private static final String CADToEUROption = "3";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyCADToEUR (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public boolean calculateCurrency() {
		if (this.idMenuOption.equals(CADToEUROption)) {
			System.out.println("You selected CAD to EUR");
			
			System.out.println(amount + " CAD is " + this.amount * 0.65 + " EUR");
		
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
