package stackperson;

class Stack {
    private Person arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        capacity = size;
        arr = new Person[capacity];
        top = -1;
    }

    Stack(Person[] inputArr) {
        capacity = inputArr.length;
        arr = new Person[capacity];
        for (int i = 0; i < capacity; i++) {
            arr[i] = inputArr[i];
        }
        top = capacity - 1;
    }

    void push(Person p) {
        if (top >= capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = p;
        System.out.println("Person pushed successfully");
    }

    void push(Person p1, Person p2) {
        push(p1);
        push(p2);
    }

    Person pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        }
        return arr[top--];
    }

    void pop(int n) {
        if (n <= 0) {
            System.out.println("Invalid number of Persons to pop");
            return;
        }

        for (int i = 0; i < n; i++) {
            Person p = pop();
            if (p == null) break;
            System.out.println("Popped Person:");
            p.displayPerson();
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Persons in stack (Top to Bottom):");
        for (int i = top; i >= 0; i--) {
            arr[i].displayPerson();
        }
    }

    void display(int n) {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        if (n <= 0) {
            System.out.println("Invalid number of Persons to display");
            return;
        }

        System.out.println("Top " + n + " Persons:");
        for (int i = top; i >= 0 && i > top - n; i--) {
            arr[i].displayPerson();
        }
    }
}
