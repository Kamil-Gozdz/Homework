package Homework.day1.Streams.Task1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class Task1Test {
    private static final List<String> ALL_WORDS = List.of("Cat", "Woman", "cut", "coconut","cat", "cir");
    private static final List<String> EXPECTED_RESULT = List.of("cut", "cat", "cir");
    @Test
    void shouldDisplayStringsStartsWithCAndThreeLettersLong() {
        //when
        List<String> result = Task1.search(ALL_WORDS);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }


@Test
void shouldAddEForEvenAndOForOddNumbers(){
        //given
    List<Integer> NUMBERS = List.of(2, 3, 5, 6, 7, 8, 9);
        //when
    String result = Task1.getString(NUMBERS);
        //then
    assertThat(result).isEqualTo("e2,o3,o5,e6,o7,e8,o9");
    }
}