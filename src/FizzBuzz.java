public class FizzBuzz {

    private volatile int count;

/*

    public FizzBuzz(int n) {
        this.n = n;
        this.count = 1;


    }*/

    public void fizz() {
        for (int i = 1; i <= 15; i++) {

            if (i % 3 == 0 && i % 5 != 0 && i <= 15) {
                System.out.print("fizz" + i + ", ");


            }
        }

    }

    public void buzz() {
        for (int i = 1; i <= 15; i++) {

            if (i % 5 == 0 && i % 3 != 0 && i <= 15) {
                System.out.print("buzz" + i + ", ");
            }

        }
    }


    public void fizzbuzz() {
        for (int i = 1; i <= 15; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i <= 15) {
                System.out.print("fizzbuzz" + i + ", ");

            }
        }
    }


    public void number() {
        for (int i = 1; i <= 15; i++) {
            if (i % 3 != 0 && i % 5 != 0 && i <= 15) {
                System.out.print(i + ", ");
            }

        }


    }

}

