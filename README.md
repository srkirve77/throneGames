# throneGames

## Requirements
java supported version 1.8, 1.11




## Build Project and Run JUnit Test cases
Run following command to build project and run test cases

`./gradlew build`




## How to Run Jar file
`java -jar <path to geektrust.jar> <path to input file>`
### for eg. 
In current version of project following command gives the output

`java -jar build/libs/geektrust.jar src/main/resources/input.txt`


## Description

Project source directory : src/main/java/


Project Layout : 


- com
  - geektrust
    - tameofthrones
      - dto                     (contains the data types defined by developer)
      - exceptions              (Custom exceptions )
      - exchanges               (Classes which help in managing input/Output data)
      - io                      (Classes which are in contact with input files)    
      - services                (messaging service is included in this folder)
      - Solution.java           (This is the main class of the project)

