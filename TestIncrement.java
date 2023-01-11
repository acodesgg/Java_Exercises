package exercises;

public class TestIncrement {

	public static void main(String[] args) {
		// Variable Declaration
		int i = 2;
		int iInc;
		
		//Operation for i++
		iInc = i++;
		System.out.println("The result for i++, iInc = "+iInc+", i = "+i );
		
		// Variable Re-declaration
		i = 2;
		
		//Operation for ++i
		iInc = ++i;
		System.out.println("The result for ++i, iInc = "+iInc+", i = "+i );

	}

}
