package amruth.in.number;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class NumberTest {
    private final Number number = new Number(5);

    @Test
    void add() {
        assertThat(number.add(4)).isEqualTo(9);
    }

    @Test
    void subtract() {
        assertThat(number.subtract(4)).isEqualTo(1);
    }

    @Test
    void divide() {
        assertThat(number.divide(5)).isEqualTo(1);
    }

    @Test
    void multiply() {
        assertThat(number.multiply(4)).isEqualTo(20);
    }
}
