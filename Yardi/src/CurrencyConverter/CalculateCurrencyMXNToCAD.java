package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between MXN to CAD.
 * @author Marcos
 *
 */
public class CalculateCurrencyMXNToCAD implements Currency {
	
	private static final String MXNToCADOption = "8";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyMXNToCAD (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public void calculateCurrency() {
		if (this.idMenuOption.equals(MXNToCADOption)) {
			System.out.println("You selected MXN to CAD");
			
			System.out.println(amount + " MXN is " + this.amount * 0.068 + " CAD");
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
