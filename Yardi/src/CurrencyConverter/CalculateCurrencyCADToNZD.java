package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between CAD to NZD.
 * @author Marcos
 *
 */
public class CalculateCurrencyCADToNZD implements Currency {
	
	private static final String CADToNZDOption = "19";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyCADToNZD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public boolean calculateCurrency() {
		if (this.idMenuOption.equals(CADToNZDOption)) {
			System.out.println("You selected CAD to NZD");
			
			System.out.println(amount + " CAD is " + this.amount * 1.09 + " NZD");
		
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
