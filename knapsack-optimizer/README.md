Name: Andrei Chiuzbaian </br>
Email: andrei.chiuzbaian@gmail.com


**Instructions** - How to unpack, build and execute the knapsack-optimizer solution </br>

In order to run the knapsack-optimizer solution please start by cloning the repo on your local machine. </br>

You can choose to run the solution by: </br>
**1.  Using your favorite IDE (I was using Eclipse IDE).** </br>
* Make sure you have the latest JDK installed. </br>
* Go to File -> Open File -> ./Knapsack-optimizer/solution/Knapsack.java. </br>
* Also used for running the Unit test I've implemented (KnapsackTest.java) in order to test one of the methods used in the solution part. </br>

**2.  Using the command line (I used GitBash).** </br>
* Navigate to the solution folder: ./Knapsack-optimizer/solution </br>
* Run: $ java Knapsack </br>

**3.  Run the solution as a conteinerized application. I used Docker as it's one of the most used tools for building containers.** 
* In the solution folder I created a Dockerfile with all the info needed for building and running the solution inside a container. </br>
* Make sure Docker is installed on your OS. </br>
* Open the command line and navigate to the solution folder: ./Knapsack-optimizer/solution </br>
* Run: $ docker build -t knapsack . </br>
* The "docker build" command builds an image from the Dockerfile. </br>
* After the build was successful type: $ docker run -i knapsack  </br>
* The "docker run" command will tell Docker to run the solution as a process inside an isolated container. </br>


 
