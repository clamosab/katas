import java.io.Console;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Write a program that prints one line for each number from 1 to 100
// For multiples of three print Fizz instead of the number
// For the multiples of five print Buzz instead of the number
// For numbers which are multiples of both three and five print FizzBuzz instead of the number


class FizzBuzzTest {

    @Test
    void should_return_a_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> response = fizzBuzz.getData();
        Assertions.assertEquals("1", response.get(1-1));
    }
    
    @Test
    void should_return_fizz_if_three() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> response = fizzBuzz.getData();
        Assertions.assertEquals("Fizz", response.get(3-1));
    }

    @Test
    void should_return_buzz_if_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> response = fizzBuzz.getData();
        Assertions.assertEquals("Buzz", response.get(5-1));
    }

    @Test
    void should_return_FizzBuzz_if_fifteen() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> response = fizzBuzz.getData();
        Assertions.assertEquals("FizzBuzz", response.get(15-1));
    }

    @Test
    void should_return_100_results() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> response = fizzBuzz.getData();
        Assertions.assertEquals(100, response.size());
    }

    @Test
    void should_return_fizz_if_multiple_of_three(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> response = fizzBuzz.getData();
        for (int i=0; i<100; i++) {
            if ((i%3 == 0) && (i%5!=0)) {
                Assertions.assertEquals("Fizz", response.get(i-1));
            }
        }
    }

    @Test
    void should_return_buzz_if_multiple_of_five() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> response = fizzBuzz.getData();
        for (int i=0; i<100; i++) {
            if ((i%5 == 0) && (i%3!=0)) {
                Assertions.assertEquals("Buzz", response.get(i-1));
            }
        }
    }

    @Test
    void should_return_fizzbuzz_if_multiple_of_fifteen() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> response = fizzBuzz.getData();
        for (int i=1; i<=100; i++) {
            if (i%15 == 0) {
                Assertions.assertEquals("FizzBuzz", response.get(i-1));
            }
        }
    }
}
