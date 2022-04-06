package interfacePractice;

public class FibIteration implements FindFib{
	
	public int calculate_fib(int numb)
	{
		int fibNum =0;
		int temp1;
		int temp2;
		int[] array = new int[numb+3];
		
		
		if (numb == 1 || numb == 2)
		{
			fibNum = 1;
		}
		else
		{
			for(int i = 0; i<array.length-1; i++) {
				
				if(i == 0 || i ==1)
				{
					array[i] = 1;
					array[i] = 1;
				}
				else {
				temp1 = array[i];
				temp2 = array[i-1];
				
				fibNum = temp1 + temp2;
				array[i+1] = fibNum;
				}
				
			}
		}
		
		
		return fibNum;
	}

}
