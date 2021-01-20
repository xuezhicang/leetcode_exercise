# Stack

## initialize a new Stack
```java
Stack<Character> stack = new Stack<Character>();
Stack<Integer> stack = new Stack<Integer>();
```

## To add a new item or items
```java
// Creating an empty Stack 
Stack<String> stack = new Stack<String>(); 
// Use add() method to add elements in the Stack 
stack.add("Geeks"); 
stack.add("for"); 
stack.add("Geeks"); 
stack.add("10"); 
stack.add("20"); 

// A collection is created 
Collection<String> c = new ArrayList<String>(); 
c.add("A"); 
c.add("Computer"); 
c.add("Portal"); 
c.add("for"); 
c.add("Geeks"); 
// Appending the collection to the Stack 
stack.addAll(c); 
// Clearing the Stack using clear() and displaying 
System.out.println("The new Stack is: " + stack); 

//use the push method to add element to the stack
stack.push("Hello"); 
stack.push("World"); 
```