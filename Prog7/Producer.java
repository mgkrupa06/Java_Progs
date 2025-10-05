package source;

public class Producer extends Thread {
    MessageBoard board;
    public Producer(MessageBoard b) { board = b; }

    public void run() {
        String msgs[] = {
            "Exam on Monday",
            "Holiday on Tuesday",
            "Workshop on Wednesday"
        };
        for (String m : msgs) {
            board.put(m);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}
