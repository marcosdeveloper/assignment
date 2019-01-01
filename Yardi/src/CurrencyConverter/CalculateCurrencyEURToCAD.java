package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between EUR to CAD.
 * @author Marcos
 *
 */
public class CalculateCurrencyEURToCAD implements Currency {
	
	private static final String EURToCADOption = "4";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyEURToCAD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public boolean calculateCurrency() {
		if (this.idMenuOption.equals(EURToCADOption)) {
			System.out.println("You selected EUR to CAD");
			
			System.out.println(amount + " EUR is " + this.amount * 1.55 + " CAD");
		
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
