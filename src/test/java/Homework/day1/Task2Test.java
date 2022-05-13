package Homework.day1;

import Homework.day1.Task2.Sorter;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Task2Test {
    private static final List<String> UNSORTED = List.of("B", "a", "C", "A", "D", "b", "c", "d");
    private static final List<String> EXPECTED_RESULT = List.of("D", "d", "C", "c", "B", "b", "A", "a");
    @Test
 void shouldSortListOfStringFromZToA_UsingAnonymousClass(){
        // when
        List<String> result = Sorter.sortListFromZToAUsingAnonymousClass(UNSORTED);

        // then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }
    @Test
    void shouldSortListOfStringFromZToA_UsingOwnComparator(){
        // when
        List<String> result = Sorter.sortUsingOwnComparator(UNSORTED);

        // then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }
    @Test
    void shouldSortListOfStringFromZToA_UsingLambda(){
        // when
        List<String> result = Sorter.sortListFromZToAUsingLambda(UNSORTED);

        // then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }
    @Test
    void shouldSortListOfStringFromZToA_UsingStream(){
        // when
        List<String> result = Sorter.sortListFromZToAUsingStream(UNSORTED);

        // then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }

}