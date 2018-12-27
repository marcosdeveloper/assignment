package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between BRL to CAD.
 * @author Marcos
 *
 */
public class CalculateCurrencyBRLToCAD implements Currency {
	
	private static final String BRLToCADOption = "6";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyBRLToCAD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public void calculateCurrency() {
		if (this.idMenuOption.equals(BRLToCADOption)) {
			System.out.println("You selected BRL to CAD");
			
			System.out.println(amount + " BRL is " + this.amount * 0.35 + " CAD");
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
