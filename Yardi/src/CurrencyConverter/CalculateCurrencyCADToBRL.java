package CurrencyConverter;

/**
 * Class responsible for making the currency conversion between CAD to BRL.
 * @author Marcos
 *
 */
public class CalculateCurrencyCADToBRL implements Currency {
	
	private static final String CADToBRLOption = "5";
	
	private String idMenuOption;
	private Double amount;
	
	public CalculateCurrencyCADToBRL (String idMenuOption, Double amount) {
		this.idMenuOption = idMenuOption;
		this.amount = amount;
	}

	@Override
	public void calculateCurrency() {
		if (this.idMenuOption.equals(CADToBRLOption)) {
			System.out.println("You selected CAD to BRL");
			
			System.out.println(amount + " CAD is " + this.amount * 2.85 + " BRL");
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
