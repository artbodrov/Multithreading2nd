public class FizzBuzz {

    static int n;
    volatile static int count;

    public FizzBuzz(int n) {

        this.n = n;



    }

    public void fizz() {

        while (count < n) {
            ++count;

            {
                if (count % 3 == 0 && count % 5 != 0) {
                    System.out.print("fizz"  + ", ");
                }

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void buzz() {
        int localvar = 0;
        while (localvar < n) {
            if (localvar != count) {
                if (count % 5 == 0 && count % 3 != 0) {
                    System.out.print("buzz" +", ");
                }
                localvar = count;
            }
        }
    }

    public void fizzbuzz() {
        int localvar = 0;
        while (localvar < n) {
            if (localvar != count) {
                if (count % 3 == 0 && count % 5 == 0 && count <= 15) {
                    System.out.print("fizzbuzz" +  ", ");
                }
                localvar = count;

            }
        }
    }

    public void number() {
        int localvar = 0;
        while (localvar < n) {
            if (localvar != count) {
                if (count % 3 != 0 && count % 5 != 0) {
                    System.out.print(count + ", ");

                }
                localvar = count;
            }
        }
    }
}

