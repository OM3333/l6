import java.util.AbstractList;
import java.util.NoSuchElementException;

public class CustomList<T> extends AbstractList<T> {

    private class Node{
        T value = null;
        Node next = null;
    }

    private Node first = null;
    private Node last = null;

    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if(first == null){
            first = node;
            last = node;
        }
        else{
            last.next = node;
            last = node;
        }
    }

    public T getLast(){
        if(last == null){
            throw new NoSuchElementException();
        }
        return last.value;
    }

    public void addFirst(T value){
        Node node = new Node();
        node.next = first;
        node.value = value;
        if(last == null){
            last = node;
            first = node;
        }
        else{
            node.next = first;
            first = node;
        }
    }

    public T getFirst(){
        if(first == null){
            throw new NoSuchElementException();
        }
        return first.value;
    }
    public T removeFirst(){
        T firstValue = getFirst();
        if(first == last){
            first = null;
            last = null;
        }
        else{
            first = first.next;
        }
        return firstValue;
    }

    public T removeLast(){
        T lastValue = getLast();
        Node newLast = first;
        if(first == last){
            first = null;
            last = null;
            return lastValue;
        }
        while(newLast.next != last){
            newLast = newLast.next;
        }
        newLast.next = null;
        last = newLast;
        return lastValue;
    }
}
