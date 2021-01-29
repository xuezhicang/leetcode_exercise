# List

## initialize a new list
```java
List b = new LinkedList();
```

## count the size of the list
```java
b.size()
```
## remove element from the list
```java
List<String> list = new ArrayList<>();
list.add("A");
list.add("B");
list.add("C");
list.add("C");
list.add("B");
list.add("A");
System.out.println(list);

String removedStr = list.remove(1);
System.out.println(list);
System.out.println(removedStr);
```
the output is
> [A, B, C, C, B, A]

> [A, C, C, B, A]

> B

## traverse through the list
```java
for (int i = 0; i < current_list.size(); i++) 
    System.out.println(current_list.get(i))
```