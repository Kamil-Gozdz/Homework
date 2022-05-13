package Homework.day1.Streams.Task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
    private List<Programmer> programmers;
   private Programmer programmer1;
   private Programmer programmer2;
   private Programmer programmer3;
   private Programmer programmer4;
   private Programmer programmer5;
   private Programmer programmer6;
   private Programmer programmer7;

    @BeforeEach
    void setUp (){
        Person person1 = new Person("Karl", "Johns",29,"Man");
        Person person2 = new Person("Judy", "Foster",16,"Woman");
        Person person3 = new Person("John", "McLane",32,"Man");
        Person person4 = new Person("Adam", "Curtis",45,"Man");
        Person person5 = new Person("Sofia", "Smith",15,"Woman");
        Person person6 = new Person("Candy", "Crush",35,"Woman");
        Person person7 = new Person("Peter", "Parker",21,"Man");

        programmer1 = new Programmer(person1, List.of("Java"));
        programmer2 = new Programmer(person2, List.of());
        programmer3 = new Programmer(person3, List.of("Java","C++"));
        programmer4 = new Programmer(person4, List.of("Java","C#"));
        programmer5 = new Programmer(person5, List.of("Java","PHP","C#"));
        programmer6 = new Programmer(person6, List.of("Python","Java"));
        programmer7 = new Programmer(person7, List.of("Java","C#"));

        programmers = List.of(programmer1,programmer2,programmer3,programmer4,programmer5,programmer6,programmer7);
    }

    @Test
    void shouldShowOnlyMens(){
        //when
        List<Programmer> result = Methods.getOnlyMen(programmers);
        //then
        assertThat(result).containsExactly(programmer1,programmer3,programmer4,programmer7);
    }
    @Test
    void shouldShowNotAdultsJavaProgrammers(){
        //when
        List<Programmer> result = Methods.getNotAdultJavaProgrammers(programmers);
        //then
        assertThat(result).containsExactly(programmer5);
    }
    @Test
    void shouldShowProgrammersWhoKnowMoreThanOneLanguage(){
        //when
        List<Programmer> result = Methods.getProgrammersWhoKnowMoreThanOneLanguage(programmers);
        //then
        assertThat(result).containsExactly(programmer3,programmer4,programmer5,programmer6,programmer7);
    }
    @Test
    void shouldShowFemaleProgrammersWhichKnowCAndJava(){
        //when
        List<Programmer> result = Methods.getFemaleProgrammersWhichKnowCAndJava(programmers);
        //then
        assertThat(result).containsExactly(programmer5);
    }
    @Test
    void shouldShowMensNames(){
        //when
        List<String> result = Methods.getMensNames(programmers);
        //then
        assertThat(result).containsExactly("Karl", "John", "Adam", "Peter");
    }

    @Test
    void shouldShowSetOfAllLanguages(){
        //when
        Set<String> result = Methods.getAllLanguages(programmers);
        //then
        assertThat(result).contains("Java","C++","C#","PHP","Python");
    }
    @Test
    void shouldShowProgrammersWhoKnowMoreThanTwoLanguages(){
        //when
        List<String> result = Methods.getProgrammersWhoKnowMoreThanTwoLanguages(programmers);
        //then
        assertThat(result).containsExactly("Smith");
    }
    @Test
    void shouldCheckProgrammerWhoKnowZeroLanguages(){
        //when
        boolean result = Methods.checkIfThereIsPersonWhoKnowsZeroLanguages(programmers);
        //then
        assertThat(result).isTrue();
    }
    @Test
    void shouldShowAmountOfLanguagesKnownByFemales(){
        //when
        long result = Methods.getLanguagesKnownByFemales(programmers);
        //then
        assertThat(result).isEqualTo(4L);
    }
}