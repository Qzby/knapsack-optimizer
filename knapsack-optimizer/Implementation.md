**Knapsack-optimizer solution**

Assumption: The weight of each item and the max. capacity are assumed to be expressed in the same measurement unit.


* The solution was implemented from ground up around the concept of maximizing the profit of a bag full of items of different values.  
In order to calculate the profit for each item I used a simple formula: Profit (P) = Value (V) / Weight (W).

* When the solution gets compiled the user is required to input the number of items (console). This number has to be a positive integer number > 0 or otherwise the users
will receive an "INPUT ERROR !" message asking them for the correct input type.
 
* Once the no. of items has been specified, the user will be prompted to input the weights and values for each item. 
Lastly, the max. capacity has to be specified before the result can get calculated.  

**Input:**
The number of items: Positive int number > 0.   
The weight for each item: Positive float number > 0.
The value for each item: Positive float number > 0.
The maximum capacity: Positive float number > 0 && number >= items(any)

* I used the Scanner function to read the user input and created two arrays of size[items], one for the items weights and one for their values. The weights and values of each item
will be stored in these two arrays.

* In order to make sure the user inputs the right data type numbers i used a few while loops together with some boolean statements 
in order to make sure the right type of input gets processed. Furthermore, I took advantage of the fact I could catch exceptions like
"InputMismatchException" and turn them into warning messages to inform the users about their error.

* After all the inputs have been introduced the program will compute the profit (P) for each item using the method Profit(). A third array of size[items] is created in order 
to store the profit for each item.

* I used a for loop that iterates through the profit[] array and stores items (starting from the most profitable one to the least) 
into a new ArrayList<String> as long as totalWeight(items) <= max. capacity. It also makes sure that no item will be added twice.

* Once the max. capacity has been reached the program will output the results

**Output:**
The items packed (ordered from the most profitable to the least): String()
The total weight of the backpack: String()
The total value of the backpack: String()



 

