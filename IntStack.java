package Stack;

public class IntStack {
    private int[] stackArray;
    private int top;
    private int capacity;
    
    public IntStack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1;
    }
    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("스택이 너무 꽉차있어요 님;");
            return;
        }
        stackArray[++top] = data;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }
        return stackArray[top--];
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public int size() {
        return top + 1;
    }
    public int capacity() {
        return capacity;
    }
    public void dump() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack Elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}