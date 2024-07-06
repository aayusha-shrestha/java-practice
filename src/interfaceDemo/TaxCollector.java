package interfaceDemo;

public class TaxCollector {
	
	public static void main (String[]args) {
		TaxPayer[] taxPayers = {
				new EmployedPerson("Billy", "ssn-1123"),
				new MomPopShop("coffeeshop","corp-id")
				};
	
		double taxesCollectedAmt = 0;
		
		for(TaxPayer taxPayer : taxPayers) {
			taxesCollectedAmt += taxPayer.payTaxes();
		}
		
		System.out.printf("Taxes Collected: %.2f ", taxesCollectedAmt);
	}
}
