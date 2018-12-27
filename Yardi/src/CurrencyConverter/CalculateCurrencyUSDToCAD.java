package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between USD to CAD.
 * @author Marcos
 *
 */
public class CalculateCurrencyUSDToCAD implements Currency {
	
	private static final String USDToCADOption = "1";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyUSDToCAD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public void calculateCurrency() {
		if (this.idMenuOption.equals(USDToCADOption)) {
			System.out.println("You selected USD to CAD");
			
			System.out.println(amount + " USD is " + this.amount * 1.31 + " CAD");
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
