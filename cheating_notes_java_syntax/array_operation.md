# Array

## create a new array
```java
int[] myNum_1 = {10, 20, 30, 40};
int[] myNum_2 = new int[10]; // the 10 is the length;
//We can also set other types 
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
```
## Access the Elements of an Array
```Java
Systm.out.println(myNum_1[2])
// the output is 30

```
## Change an Array Element
```Java
cars[0] = "AAAAA";
//then,
Systm.out.println(cars[0])
//the output is AAAAA
```

## Loop Through an Array with For-Each
```Java
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}

for (Int i : myNum_2) {
  System.out.println(i);
}
```

## Multidimensional Arrays
```Java
//the format is as same as the one-dimensional array
int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
```



## copyOf and copyOfRange
```Java

//public static int[] copyOf(int[] original,int newLength)

import java.util.Arrays;

public class ArrayDemo {
   public static void main(String[] args) {

      // intializing an array arr1
      int[] arr1 = new int[] {45, 32, 75};

      // printing the array
      System.out.println("Printing 1st array:");
      for (int i = 0; i < arr1.length; i++) {
         System.out.println(arr1[i]);  
      }

      // copying array arr1 to arr2 with newlength as 5
      int[] arr2 = Arrays.copyOf(arr1, 5);
      arr2[3] = 11;
      arr2[4] = 55;   

      // printing the array arr2
      System.out.println("Printing new array:");
      for (int i = 0; i < arr2.length; i++) {
         System.out.println(arr2[i]);
      }
   }
}

//public static short[] copyOfRange(short[] original, int from, int to)
import java.util.Arrays;

public class ArrayDemo {
   public static void main(String[] args) {

      // intializing an array arr1
      short[] arr1 = new short[] {15, 10, 45};

      // printing the array
      System.out.println("Printing 1st array:");
      for (int i = 0; i < arr1.length; i++) {
         System.out.println(arr1[i]);  
      }

      // copying array arr1 to arr2 with range of index from 1 to 3
      short[] arr2 = Arrays.copyOfRange(arr1, 1, 3);
      
      // printing the array arr2
      System.out.println("Printing new array:");
      for (int i = 0; i < arr2.length; i++) {
         System.out.println(arr2[i]);
      }
   }
}


```
Arrays.copyOfRange(nums, piv, nums.length)