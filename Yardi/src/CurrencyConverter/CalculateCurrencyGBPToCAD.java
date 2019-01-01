package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between GBP to CAD.
 * @author Marcos
 *
 */
public class CalculateCurrencyGBPToCAD implements Currency {
	
	private static final String GBPToCADOption = "14";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyGBPToCAD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public boolean calculateCurrency() {
		if (this.idMenuOption.equals(GBPToCADOption)) {
			System.out.println("You selected GBP to CAD");
			
			System.out.println(amount + " GBP is " + this.amount * 1.71 + " CAD");
		
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
