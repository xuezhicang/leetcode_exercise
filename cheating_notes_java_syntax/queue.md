# Queue

## initialize a new Queue
```java
Queue<Integer> q = new LinkedList<Integer>();
```

## To add a new item or items
```java
//add one element to the queue 
q.add(a);
//add the whole Collection to the queue
q.add(list);
```
## To remove the head of queue.
```java
int remove_the_first_one = q.remove();
int remove_the_second_one = q.poll();
```
The difference between the *.remove()* and *.poll()* exists. 
The *remove()* and *poll()* methods differ only in their behavior when the queue is empty: the *remove()* method throws an exception, while the *poll()* method returns null
```java
public E remove() {
    E x = poll();
    if (x != null)
        return x;
    else
        throw new NoSuchElementException();
}
```

## To obtain the first element of queue, but do not delete it

The peek() methods return, but do not remove, the head of the queue.
```java
//the first element is in a now, and it is not deleted.
int a = q.peek();
```