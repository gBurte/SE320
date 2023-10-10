import java.util.Arrays;

public class GenericStack<E> {
    private static final int defaultCapacity = 10;
    private Object[] array;
    private int size;

// For my reference:
//    public static void main(String[] args) {
//        GenericStack<String> stack = new GenericStack<String>(10);
//        stack.push("10");
//        stack.push("13");
//        stack.push("122");
//        System.out.println(stack.getSize());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.toString());
//    }

    public GenericStack() {
        this(defaultCapacity);
    }

    public GenericStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Stop. That's Illegal!!! Initial Capacity must be greater than 0.");
        }
        array = new Object[initialCapacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Oh no. Stack is empty.");
        }
        return (E) array[size - 1];
    }

    public void push(E o) {
        ensureCapacity();
        array[size++] = o;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Oh no. Stack is empty.");
        }
        E o = (E) array[--size];
        array[size] = null;
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < size; i++) {
            string += array[i] + " ";
        }
        return "Stack: " + string;
    }
}

