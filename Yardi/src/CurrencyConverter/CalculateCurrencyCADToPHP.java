package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between CAD to PHP.
 * @author Marcos
 *
 */
public class CalculateCurrencyCADToPHP implements Currency {
	
	private static final String CADToPHPOption = "15";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyCADToPHP (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public void calculateCurrency() {
		if (this.idMenuOption.equals(CADToPHPOption)) {
			System.out.println("You selected CAD to PHP");
			
			System.out.println(amount + " CAD is " + this.amount * 39.42 + " PHP");
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
