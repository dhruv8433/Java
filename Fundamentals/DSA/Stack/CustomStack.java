public class CustomStack {
    protected int[] data;
    private static final int FINAL_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(FINAL_SIZE); // initialize default size
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int value) {
        if (isFull()) {
            return false; // stack is full
        }

        ptr++;
        data[ptr] = value;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot pop from empty stack");
        }

        // int value = data[ptr];
        // ptr--;
        return data[ptr--];
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot peek from empty stack");
        }

        return data[ptr];
    }

    private boolean isFull() {
        return ptr == data.length - 1; // ptr is at last position of stack
    }

    private boolean isEmpty() {
        return ptr == -1;
    }
}
