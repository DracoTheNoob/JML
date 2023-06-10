# JavaMathLibrary #

## Generate Random ##
To generate random int you need to write :
```java
new Random().Int(min, max);
```
"min" and "max" are the minimum and maximum values of the randomly generated number. If you want to generate another data type, you can replace "Int" by the datatype name that you want. The first letter needs to be in uppercase, because if the method names where in lowercase, java would recognize method names as primitives datatypes and not the names of the methods. Example for byte between 10 and 20 :
```java
new Random().Byte((byte)10, (byte)20);
``` 
There is an exception for randomly generated booleans : there is no min and max because boolean can only takes true or false : 
```java
new Random().Boolean();
```