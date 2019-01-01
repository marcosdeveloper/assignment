package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between CAD to CNY.
 * @author Marcos
 *
 */
public class CalculateCurrencyCADToCNY implements Currency {
	
	private static final String CADToCNYOption = "11";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyCADToCNY (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public boolean calculateCurrency() {
		if (this.idMenuOption.equals(CADToCNYOption)) {
			System.out.println("You selected CAD to CNY");
			
			System.out.println(amount + " CAD is " + this.amount * 5.10 + " CNY");
		
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
