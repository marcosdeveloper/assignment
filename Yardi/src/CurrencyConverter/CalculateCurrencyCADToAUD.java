package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between CAD to AUD.
 * @author Marcos
 *
 */
public class CalculateCurrencyCADToAUD implements Currency {
	
	private static final String CADToAUDOption = "17";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyCADToAUD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public boolean calculateCurrency() {
		if (this.idMenuOption.equals(CADToAUDOption)) {
			System.out.println("You selected CAD to AUD");
			
			System.out.println(amount + " CAD is " + this.amount * 1.04 + " AUD");
			
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
