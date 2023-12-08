import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PagIbig pagIbig1 = PagIbig.getInstance();
        PagIbig pagIbig2 = PagIbig.getInstance();

        pagIbig1.getQueueNumber();
        pagIbig1.getQueueNumber();
        pagIbig1.getQueueNumber();
        pagIbig1.displayCurrentQueuedNumber();
        pagIbig2.getQueueNumber();
        pagIbig2.displayCurrentQueuedNumber();

        scanner.close();
    }
}