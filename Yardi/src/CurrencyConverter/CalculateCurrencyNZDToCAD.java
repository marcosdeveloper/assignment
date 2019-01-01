package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between NZD to CAD.
 * @author Marcos
 *
 */
public class CalculateCurrencyNZDToCAD implements Currency {
	
	private static final String NZDToCADOption = "20";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyNZDToCAD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public boolean calculateCurrency() {
		if (this.idMenuOption.equals(NZDToCADOption)) {
			System.out.println("You selected NZD to CAD");
			
			System.out.println(amount + " NZD is " + this.amount * 0.91 + " CAD");
		
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
