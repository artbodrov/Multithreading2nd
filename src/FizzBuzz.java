
public class FizzBuzz {
    private  int n;
    private    int  count;

    public FizzBuzz(int n) {
        this.n = n;

    }


    public   void fizz() {
     for (count = 1; count <= n; ) {
            if (count % 3 == 0 && count % 5 != 0) {
                System.out.print("fizz" +count+ ", ");
               count++;

                Thread.yield();
            } else {
                Thread.yield();
            }
        }
  }


    public  void buzz() {
       for (count = 1; count <= n;) {
            if (count % 5 == 0 && count % 3 != 0) {
                System.out.print("buzz" +count+ ", ");
                count++;
                Thread.yield();
            } else {
                Thread.yield();
            }
        }
    }


    public   void fizzbuzz() {
        for (count = 1; count <= n;) {
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.print("fizzbuzz" +count+ ", ");
                count++;
                Thread.yield();

            } else {
                Thread.yield();
            }
        }
    }


    public  void number() {
      for (count = 1; count <= n; ) {
            if (count % 3 != 0 && count % 5 != 0) {
                System.out.print(count + ", ");
               count++;
                Thread.yield();

            } else {
                Thread.yield();
            }
        }
    }
}