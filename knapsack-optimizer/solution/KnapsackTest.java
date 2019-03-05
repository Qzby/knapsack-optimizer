
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class KnapsackTest {

	@Test
	public void Profit() {
		//Defining two arrays of equal size
		float[] Weights = new float[] {2, 5, 9, 3, 1};
		float[] Values = new float[] {3, 1, 7, 2, 9};		
		
		//Testing out the Knapsack.Profit method()
		float[] result = Knapsack.Profit(Weights, Values);		
		float[] expectedResult = new float[] {(float)1.5, (float)0.2, (float)0.7777778, (float)0.6666667, (float)9.0};
		
		assertArrayEquals(expectedResult, result);		
	}

}
