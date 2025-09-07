package library;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    Stack(int[] inputArr) {
        capacity = inputArr.length;
        arr = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = inputArr[i];
        }
        top = capacity - 1;
    }

    void push(int x) {
        if (top >= capacity - 1) {
            System.out.println("Stack Overflow" + x);
            return;
        }
        arr[++top] = x;
        System.out.println("Pushed: " + x);
    }

    void push(int x, int y) {
        push(x);
        push(y);
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    void pop(int n) {
        if (n <= 0) {
            System.out.println("Invalid number of elements to pop");
            return;
        }

        for (int i = 0; i < n; i++) {
            int val = pop();
            if (val == -1) break;
            System.out.println("Popped: " + val);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack contents (Top to Bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    void display(int n) {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        if (n <= 0) {
            System.out.println("Invalid number of elements");
            return;
        }

        System.out.println("Top " + n + " elements:");
        for (int i = top; i >= 0 && i > top - n; i--) {
            System.out.println(arr[i]);
        }
    }
}
