package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between CAD to USD.
 * @author Marcos
 *
 */
public class CalculateCurrencyCADToUSD implements Currency {
	
	private static final String CADToUSDOption = "2";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyCADToUSD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public void calculateCurrency() {
		if (this.idMenuOption.equals(CADToUSDOption)) {
			System.out.println("You selected CAD to USD");
			
			System.out.println(amount + " CAD is " + this.amount * 0.77 + " USD");
		}
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
