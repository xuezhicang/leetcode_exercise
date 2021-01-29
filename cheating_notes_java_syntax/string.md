# String

## == vs. equals()
We can use == operators for reference comparison (address comparison) and .equals() method for content comparison

```java
String s1 = new String("HELLO"); 
String s2 = new String("HELLO"); 
System.out.println(s1 == s2); 
System.out.println(s1.equals(s2)); 

//output
//false
//true
```