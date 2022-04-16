package bankManagement;

public class NegativeDollarAmountException extends Exception{

	public NegativeDollarAmountException(String message)
	{
		super(message);
	}
}
