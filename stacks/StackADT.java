import exceptions.EmptyCollectionException;

public interface StackADT<T> {
    void push(T element);
    T pop() throws EmptyCollectionException;
    T peek() throws EmptyCollectionException;
    int size();
}
