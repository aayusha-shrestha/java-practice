package interfaceDemo;

public class MomPopShop extends Business implements TaxPayer{
	String industry;
	String ein;
	
	public MomPopShop(String businessName, String ein) {
		this.businessName = businessName;
		this.ein = ein;
	}
	
	public MomPopShop(String address, String businessName, String ein) {
		this.address = address;
		this.businessName = businessName;
		this.ein = ein;
	}

	@Override
	public double payTaxes() {
		return 0.5;
	}

	@Override
	public String getTaxId() {
		return ein;
	}
}
