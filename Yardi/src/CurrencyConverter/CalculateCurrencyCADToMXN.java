package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between CAD to MXN.
 * @author Marcos
 *
 */
public class CalculateCurrencyCADToMXN implements Currency {
	
	private static final String CADToMXNOption = "7";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyCADToMXN (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public void calculateCurrency() {
		if (this.idMenuOption.equals(CADToMXNOption)) {
			System.out.println("You selected CAD to MXN");
			
			System.out.println(amount + " CAD is " + this.amount * 14.73 + " MXN");
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
