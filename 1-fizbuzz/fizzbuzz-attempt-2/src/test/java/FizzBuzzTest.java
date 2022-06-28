import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class FizzBuzzTest {

    @Test
    void getElementFromList_With_1_Return_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getElementFromList(1)).isEqualTo("1");
    }

    @Test
    void getElementFromList_With_3_Return_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getElementFromList(3)).isEqualTo("Fizz");
    }

    @Test
    void getElementFromList_With_5_Return_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getElementFromList(5)).isEqualTo("Buzz");
    }

    @Test
    void getElementFromList_With_15_Return_FizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getElementFromList(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void getElementFromList_With_multipleOnlyOf3_Return_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getElementFromList(6)).isEqualTo("Fizz");
        assertThat(fizzBuzz.getElementFromList(9)).isEqualTo("Fizz");
        assertThat(fizzBuzz.getElementFromList(12)).isEqualTo("Fizz");
        assertThat(fizzBuzz.getElementFromList(18)).isEqualTo("Fizz");
        assertThat(fizzBuzz.getElementFromList(21)).isEqualTo("Fizz");
        assertThat(fizzBuzz.getElementFromList(24)).isEqualTo("Fizz");
    }

    @Test
    void getElementFromList_With_multipleOnlyOf5_Return_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getElementFromList(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.getElementFromList(10)).isEqualTo("Buzz");
        assertThat(fizzBuzz.getElementFromList(20)).isEqualTo("Buzz");
    }

    @Test
    void getElementFromList_With_multipleOf3And5_Return_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getElementFromList(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.getElementFromList(30)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.getElementFromList(45)).isEqualTo("FizzBuzz");
    }

    @Test
    void getElementFromList_With_noMultipleOf3Or5Or3And5_Return_TheNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getElementFromList(2)).isEqualTo("2");
        assertThat(fizzBuzz.getElementFromList(4)).isEqualTo("4");
        assertThat(fizzBuzz.getElementFromList(7)).isEqualTo("7");
        assertThat(fizzBuzz.getElementFromList(8)).isEqualTo("8");
        assertThat(fizzBuzz.getElementFromList(11)).isEqualTo("11");
    }

    @Test
    void getList_Return_100Elements() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.getList().size()).isEqualTo(100);
    }
}
