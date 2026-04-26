import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class stack<T> {
    private List<T> elements = new ArrayList<>();

    public void push(T item) { elements.add(item);}

    public T pop(){
        if (elements.isEmpty()) throw new EmptyStackException();
        return elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() { return elements.isEmpty(); }
}