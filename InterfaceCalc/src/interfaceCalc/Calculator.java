package interfaceCalc;

public class Calculator implements CalcOp{
	
	public float add(float numb1, float numb2)
	{
		float answer=numb1 + numb2;
		return answer;
	}
	public float subtract(float numb1, float numb2)
	{
		float answer= numb1 - numb2;
		return answer;
	}
	public float multiply(float numb1, float numb2)
	{
		float answer= numb1 * numb2;
		return answer;
	}
	public float divide(float numb1, float numb2)
	{
		float answer=numb1/numb2;
		return answer;
	}

}
