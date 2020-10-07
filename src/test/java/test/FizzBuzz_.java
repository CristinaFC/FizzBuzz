package test;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzz_ {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_return_number_when_it_is_not_fizz_and_not_buzz() {
        assertThat(fizzBuzz.of(1).equals("1"));
        assertThat(fizzBuzz.of(2).equals("2"));
    }

    @Test
    public void should_return_fizz_when_it_is_multiple_of_3() {
        assertThat(fizzBuzz.of(3).equals("Fizz"));
        assertThat(fizzBuzz.of(6).equals("Fizz"));

    }

    @Test
    public void should_return_buzz_when_it_is_multiple_of_5() {
        assertThat(fizzBuzz.of(5).equals("Buzz"));
        assertThat(fizzBuzz.of(10).equals("Buzz"));
    }

    @Test
    public void should_return_fizzbuzz_when_it_is_multiple_of_15() {
        assertThat(fizzBuzz.of(15).equals("FizzBuzz"));
        assertThat(fizzBuzz.of(30).equals("FizzBuzz"));
    }

    private class FizzBuzz {

        public String of(int number) {
            if (isMultipleOfFifteen(number)) return "FizzBuzz";
            if (isMultipleOfFive(number)) return "Buzz";
            if (isMultipleOfThree(number)) return "Fizz";
            return String.valueOf(number);
        }

        private boolean isMultipleOfFifteen(int number) {
            return number % 15 == 0;
        }

        private boolean isMultipleOfFive(int number) {
            return number % 5 == 0;
        }

        private boolean isMultipleOfThree(int number) {
            return number % 3 == 0;
        }
    }
}
