package source;

public class Main {
    public static void main(String[] args) {
        MessageBoard board = new MessageBoard();
        new Producer(board).start();
        new Consumer(board).start();
    }
}
