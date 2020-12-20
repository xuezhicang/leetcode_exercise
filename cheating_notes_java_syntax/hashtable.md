# HashMap, HashSet,and HashTable

There are severl types of data structure about the HashMap. The common used types are HashMap and HashSet. The previous can hole two elements in a unit. One is the key; and second element is the value. The keys must be unique; and the values can be duplicated. The Hasset is a set to store the unique keys.

The defination of these types are listed as below:

HashMap:

>Hash table based implementation of the Map interface. This implementation provides all of the optional map operations, and permits null values and the null key.

HashTable:

>This class implements the Set interface, backed by a hash table (actually a HashMap instance). It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time.

HashSet:

>This class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value.

Based on the definition, the HashMap and HashTable are very similar. Both of them can store key element and value elememnt.


## HashMap

### Crearing a new HashMap

```Java

// import the HashMap class

import java.util.HashMap; 

// HashMap<keyType, valueType> variableName = new HashMap<keyType, valueType>();

HashMap<String, String> capitalCities = new HashMap<String, String>();

``` 

### Adding new element to the HashMap

```java

// variableName.put(ketType,valueType)

capitalCities.put("England", "London");

```


### Finding elements in the HashMap

```java

System.out.println("The Value is: " + capitalCities.get("England")); //the return is London

System.out.println("Check whether a key is in the hashmap " + capitalCities.containsKey("England")); // the return is true

System.out.println("Check whether a key is in the hashmap " + capitalCities.getOrDefault("b", "nonono")); // the return is 500, because the capitalCities hashmap doesnot have the string "b"

```

### Deleting new element form the HashTable 

```java

String returned_value = hash_map.remove("England");

 System.out.println("the deleted capital is: "+ returned_value);//the results is London 

```
