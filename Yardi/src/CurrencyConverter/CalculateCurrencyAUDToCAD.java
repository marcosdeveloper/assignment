package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between AUD to CAD.
 * @author Marcos
 *
 */
public class CalculateCurrencyAUDToCAD implements Currency {
	
	private static final String AUDToCADOption = "18";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyAUDToCAD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public void calculateCurrency() {
		if (this.idMenuOption.equals(AUDToCADOption)) {
			System.out.println("You selected AUD to CAD");
			
			System.out.println(amount + " AUD is " + this.amount * 0.96 + " CAD");
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
