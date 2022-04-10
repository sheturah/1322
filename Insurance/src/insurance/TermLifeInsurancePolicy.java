package insurance;

public class TermLifeInsurancePolicy extends InsurancePolicy{
	
	//name of beneficiary
private String beneficiary;
private int term;
private double termPayout;

TermLifeInsurancePolicy(String policyHolder, String beneficiary, int term, double termPayout)
{
	super(policyHolder);
	this.beneficiary = beneficiary;
	this.term = term;
	this.termPayout =termPayout;
}

public String getBeneficiary() {
	return beneficiary;
}

public void setBeneficiary(String beneficiary) {
	this.beneficiary = beneficiary;
}

public int getTerm() {
	return term;
}

public void setTerm(int term) {
	this.term = term;
}

public double getTermPayout() {
	return termPayout;
}

public void setTermPayout(double termPayout) {
	this.termPayout = termPayout;
}

@Override
public void selectPolicyCoverage()
{
	System.out.println("Selecting Policy Coverages");
}

@Override 
public void calculatePremium()
{
	System.out.println("Calculating and Updating Premium");
}



@Override
public String toString()
{
	String statement = "Beneficiary: " + getBeneficiary() + 
			"\nTerm: " + getTerm() +
			"\nTerm Payout: " + getTermPayout();
	return statement;
}
}