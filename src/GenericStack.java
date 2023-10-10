import java.util.Arrays;

public class GenericStack<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;
    public GenericStack() {
        this(DEFAULT_CAPACITY);
    }

    public GenericStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be positive.");
        }
        elements = new Object[initialCapacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return (E) elements[size - 1];
    }

    public void push(E o) {
        ensureCapacity();
        elements[size++] = o;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        E o = (E) elements[--size];
        elements[size] = null; // Clear the reference to the popped element
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("stack: [");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

