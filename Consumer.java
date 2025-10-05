package source;

public class Consumer extends Thread {
    MessageBoard board;
    public Consumer(MessageBoard b) { board = b; }

    public void run() {
        for (int i = 0; i < 3; i++) {
            board.get();
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}
