package source;

public class MessageBoard {

    private String message;
    private boolean hasMessage = false;

    public synchronized void put(String msg) {
        while (hasMessage) {
            try { wait(); } catch (InterruptedException e) {}
        }
        message = msg;
        hasMessage = true;
        System.out.println("Producer sends: " + msg);
        notify();
    }

    public synchronized void get() {
        while (!hasMessage) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Consumer reads: " + message);
        hasMessage = false;
        notify();
    }
}

