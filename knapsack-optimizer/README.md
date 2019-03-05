Name: Andrei Chiuzbaian

Email: andrei.chiuzbaian@gmail.com


Instructions - How to unpack, build and execute the knapsack-optimizer solution

In order to run the knapsack-optimizer solution please clone the repo on your local machine.

You can choose to run the solution by:
1.Using your favorite IDE (I was using Eclipse IDE). 
-Make sure you have the latest JDK installed.
-Go to File -> Open File -> ./Knapsack-optimizer/solution/Knapsack.java. 
-Also used for running the Unit test I've implemented (KnapsackTest.java) in order to test one of the methods used in the solution part.

2.Using the command line (I used GitBash).
-Navigate to the solution folder: ./Knapsack-optimizer/solution
-Run: $ java Knapsack

3.Run the solution as a conteinerized application. I used Docker as it's one of the most used tools for building containers.
-In the solution folder I created a Dockerfile with all the info needed for building and running the solution inside a container.
-Make sure Docker is installed on your OS.
-Open the command line and navigate to the solution folder: ./Knapsack-optimizer/solution
-Run: $ docker build -t knapsack .
-The "docker build" command builds an image from the Dockerfile
-After the build was successful type: $ docker run -i knapsack 
-The "docker run" command will tell Docker to run the solution as a process inside an isolated container. 


 
