package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between CAD to GBP.
 * @author Marcos
 *
 */
public class CalculateCurrencyCADToGBP implements Currency {
	
	private static final String CADToGBPOption = "13";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyCADToGBP (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public void calculateCurrency() {
		if (this.idMenuOption.equals(CADToGBPOption)) {
			System.out.println("You selected CAD to GBP");
			
			System.out.println(amount + " CAD is " + this.amount * 0.58 + " GBP");
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
