//import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.ArrayList;

public class Knapsack {
	public static void main(String[] args) {
		//Declaring input variables
		int items;
		float wgt;
		float val;
		float cap;
		float capacity = 0;

		System.out.print("Input the number of items: ");
		Scanner reader = new Scanner(System.in);

		//Input the no. of items
		boolean test = false;
		while (!test) {
			try {
				items = reader.nextInt();
				if (items > 0) {
					test = true;
					float weight[] = new float[items];
					float value[] = new float[items];
					float profit[] = new float[items];

					//Input the weight of each item
					for (int i = 0; i < items; i++) {
						System.out.printf("Input the weight for item " + (i + 1) + ": ");
						boolean test2 = false;
						while (!test2) {
							try {		
								wgt = reader.nextFloat();
								if (wgt > 0) {
									test2 = true;
									weight[i] = wgt;
								}
								else {
									System.out.println("INPUT ERROR ! Please insert a positive (floating point) number greater than 0");
									System.out.print("Input the weight for item " + (i + 1) + ": ");
									reader.nextLine();
								}
							} catch (Exception e) {
								System.out.println("INPUT ERROR ! Please insert a positive (floating point) number greater than 0");
								System.out.print("Input the weight for item " + (i + 1) + ": ");
								reader.nextLine();
							}
						}

						//Input the value for each item
						System.out.print("Input the value for item " + (i + 1) + ": ");
						boolean test3 = false;
						while (!test3) {
							try {	
								val = reader.nextFloat();
								if (val > 0) {
									test3 = true;
									value[i] = val;
								}
								else {
									System.out.println("INPUT ERROR ! Please insert a positive (floating point) number greater than 0");
									System.out.print("Input the value for item " + (i + 1) + ": ");
									reader.nextLine();
								}
							} catch (Exception e) {
								System.out.println("INPUT ERROR ! Please insert a positive (floating point) number greater than 0");
								System.out.print("Input the value for item " + (i + 1) + ": ");
								reader.nextLine();
							}
						}						
					}			

					//Input the weight capacity
					System.out.print("Input the maximum weight capacity: ");
					boolean test4 = false;
					boolean test5 = false;
					while (!test4) {
						try {	
							cap = reader.nextFloat();
							if (cap <= 0) {
								System.out.println("INPUT ERROR ! Please insert a positive (floating point) number greater than 0");
								System.out.print("Input the maximum weight capacity: ");
								reader.nextLine();
							}
							else {
								for (int i = 0; i < items; i++) {
									if (cap >= weight[i]) {
										capacity = cap;
										test4 = true;
										test5 = true;
										break;
									}
								}
								if(!test5){
									System.out.println("Capacity is too small to hold any of the items");
									System.out.print("Input the maximum weight capacity: ");
									reader.nextLine();
								}
							}
						}catch (Exception e) {
							System.out.println("INPUT ERROR ! Please insert a positive (floating point) number greater than 0");
							System.out.print("Input the maximum weight capacity: ");
							reader.nextLine();
						}				
					}

					reader.close();

					ArrayList<String> finalItems = new ArrayList<String>();
					ArrayList<String> finalWeights = new ArrayList<String>();
					ArrayList<String> finalValues = new ArrayList<String>();

					float totalWeight = 0;
					float totalValue = 0;

					int item = 1;
					float maxP = 0;
					float maxW = 0;
					float maxV = 0;
					profit = Profit(weight, value);

					//Finding the items with the highest profit and filling up the max. weight capacity with elements that have the highest profit value
					for (int n = 0; n < items; n++) {
						for (int j = 0; j < items; j++) {
							if (profit[j] > maxP) {
								maxP = profit[j];
								maxW = weight[j];
								maxV = value[j];
								item = j + 1;
							}
						}
						
						if ((totalWeight + maxW) <= capacity) {
							totalWeight = totalWeight + maxW;
							totalValue = totalValue + maxV;
							finalItems.add(Integer.toString(item));
							finalWeights.add(Float.toString(maxW));
							finalValues.add(Float.toString(maxV));
						}

						for (int k = 0; k < items; k++) {
							if (weight[k] == maxW && value[k] == maxV) {
								profit[k] = 0;
								maxP = 0;
								maxW = 0;
								maxV = 0;
								item = 1;
							}
						}
					}

					System.out.println("Packed items (ordered from most profitable to the least profitable): ");
					
					for (String str : finalItems) {
						System.out.println(str);
					}
					System.out.println("Total Weight: " + Float.toString(totalWeight));
					System.out.println("Total value: " + Float.toString(totalValue));		
				}else {
					System.out.println("INPUT ERROR ! Please insert a positive (integer) number greater than 0");
					System.out.print("Input the number of items: ");			
					reader.nextLine();
				}
			} 
			catch (Exception e) {
				System.out.println("INPUT ERROR ! Please insert a positive (integer) number greater than 0");
				System.out.print("Input the number of items: ");
				reader.nextLine();
			}
		}
	}

	//Calculating and returning the profit for each item
	public static float[] Profit(float[] We, float[] Va) {

		float[] division = new float [We.length];
		for(int i = 0; i < We.length; i++) {
			division[i] = (float) Va[i] / We[i];
		}
		return division;
	}


}





