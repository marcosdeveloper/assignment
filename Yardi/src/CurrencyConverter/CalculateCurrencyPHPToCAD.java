package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between PHP to CAD.
 * @author Marcos
 *
 */
public class CalculateCurrencyPHPToCAD implements Currency {
	
	private static final String PHPToCADOption = "16";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyPHPToCAD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public boolean calculateCurrency() {
		if (this.idMenuOption.equals(PHPToCADOption)) {
			System.out.println("You selected PHP to CAD");
			
			System.out.println(amount + " PHP is " + this.amount * 0.025 + " CAD");
		
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
