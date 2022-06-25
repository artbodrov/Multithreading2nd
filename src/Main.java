public class Main {
    public static void main(String args[]) {
        MyPhaser phsr = new MyPhaser(1, 15);



       new MyThread(phsr);

    }
}