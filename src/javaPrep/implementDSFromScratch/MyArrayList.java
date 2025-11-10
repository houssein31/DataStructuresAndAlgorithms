package javaPrep.implementDSFromScratch;

public class MyArrayList<T> {
    private Object[] data;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    // Constructor
    public MyArrayList() {
        data = new Object[INITIAL_CAPACITY];
    }

    // Add element to end
    public void add(T value) {
        ensureCapacity();
        data[size++] = value;
    }

    // Get element at index
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    // Set element at index
    public void set(int index, T value) {
        checkIndex(index);
        data[index] = value;
    }

    // Remove element at index and shift
    public T remove(int index) {
        checkIndex(index);
        T removed = (T) data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[--size] = null; // prevent memory leak
        return removed;
    }

    // Get number of elements
    public int size() {
        return size;
    }

    // Resize if full
    private void ensureCapacity() {
        if (size == data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    // Index bounds check
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index);
        }
    }
}