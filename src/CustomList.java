import java.util.AbstractList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomList<T> extends AbstractList<T> {

    @Override
    public T get(int i) {
        Node thisNode = first;
        for(int k = 0;k<i;++k){
            if(thisNode != null){
                thisNode = thisNode.next;
            }
            else{
                throw new NoSuchElementException();
            }
        }
        return thisNode.value;
    }

    @Override
    public int size() {
        Node thisNode = first;
        int result = 0;
        while(thisNode != null){
            thisNode = thisNode.next;
            result++;
        }
        return result;
    }

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

    @Override
    public boolean add(T t) {
        addLast(t);
        return true;
    }

    public Iterator<T> iterator(){
        return new Iterator<T>() {
            Node currentNode = first;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                T value = currentNode.value;
                currentNode = currentNode.next;

                return value;
            }
        };
    }
}
