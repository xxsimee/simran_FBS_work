package s2;

public class MainDoubly {
    public static void main(String[] args) {
        Doubly d = new Doubly();

        d.insertBeg(10);
        d.insertBeg(20);
        d.insertBeg(30);
        d.insertBeg(50);

       d.deleteBeg();
        d.display();
    }
}