public class FizzBuzz {


    public  void fizz() {

        for (int t = 1; t <= 15; t++) {
            try {
                Thread.sleep(100);
            if (t % 3 == 0&&t % 5 != 0) {

                      
                    System.out.print("Fizz" + ",");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public  void buzz() {

        for (int t = 1; t <= 15; t++) {
            try {
                Thread.sleep(100);
            if (t % 5 == 0&&t % 3 != 0) {


                System.out.print("Buzz" + ",");

            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }}
        }

    public  void fizzbuzz() {

        for (int t = 1; t <= 15; t++) {
            try {
                Thread.sleep(100);
            if (t % 3 == 0 && t % 5 == 0) {


                    System.out.print("FizzBuzz" + ",");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public  void number() {

        for (int t = 1; t < 15; t++) {
            try {
                Thread.sleep(100);
            if (t % 3 != 0 && t % 5 != 0) {


                    System.out.print(t + ",");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

   }
