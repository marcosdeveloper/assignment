package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between KRW to CAD.
 * @author Marcos
 *
 */
public class CalculateCurrencyKRWToCAD implements Currency {
	
	private static final String KRWToCADOption = "10";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyKRWToCAD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public boolean calculateCurrency() {
		if (this.idMenuOption.equals(KRWToCADOption)) {
			System.out.println("You selected KRW to CAD");
			
			System.out.println(amount + " KRW is " + this.amount * 0.0012 + " CAD");
		
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
