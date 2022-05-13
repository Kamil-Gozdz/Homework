package Homework.day1.Task11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
private Circle circle;

@BeforeEach
void setUp (){
    Point2D center = new Point2D(0,0);
    Point2D point = new Point2D(4,0);
    circle = new Circle(center, point);
    circle.resize(4);
    }

    @Test
    void shouldReturnCorrectNewPositionForPointAndCenter() {
        // given
        Point2D expectedNewCenter = new Point2D(0, 0);
        Point2D expectedNewPoint = new Point2D(16, 0);
        // when
        Point2D point = circle.getPoint();
        Point2D center = circle.getCenter();
        // then
        assertThat(point).isEqualTo(expectedNewPoint);
        assertThat(center).isEqualTo(expectedNewCenter);
    }
    @Test
    void shouldReturnCorrectRadius (){
        //when
        double result = circle.getRadius();
        //then
        assertThat(result).isEqualTo(16);
    }
}