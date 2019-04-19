##client-automation

The client automation is built using Java, TestNG, Selenium and Gradle. All dependencies should be taken care of by gradle.

To run the tests:

    ./gradlew build
    ./gradlew runClientTests

By default the project is set to run the tests using `Chrome`. 

- To adjust which browser is being used go to:

  **src > test > java > BaseTest.java** 
  
  Within `startSession()`, change the method that is assigned to `browser`. 
  
  (e.g. `firefoxMac()`, `headlessChromeMac()`). Not all options have been tested out. The majority of the time chrome or
   firefox is used.
