package heliocentric;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void heliocentric() {
        assertEquals(0, Solution.heliocentric(0, 0));
        assertEquals(1, Solution.heliocentric(364, 686));
        assertEquals(5, Solution.heliocentric(360, 682));
        assertEquals(239075, Solution.heliocentric(0, 1));
        assertEquals(11679, Solution.heliocentric(1, 0));
    }
}