public class Main {
    public static void main(String args[]) {

        FizzBuzz fizzBuzz = new FizzBuzz(15);

        new Thread(fizzBuzz::fizz).start();
        new Thread(fizzBuzz::buzz).start();
        new Thread(fizzBuzz::fizzbuzz).start();
        new Thread(fizzBuzz::number).start();



    }
}