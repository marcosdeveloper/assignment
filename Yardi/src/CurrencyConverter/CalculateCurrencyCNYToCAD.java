package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between CNY to CAD.
 * @author Marcos
 *
 */
public class CalculateCurrencyCNYToCAD implements Currency {
	
	private static final String CNYToCADOption = "12";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyCNYToCAD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public void calculateCurrency() {
		if (this.idMenuOption.equals(CNYToCADOption)) {
			System.out.println("You selected CNY to CAD");
			
			System.out.println(amount + " CNY is " + this.amount * 0.20 + " CAD");
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
