package ladder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void ladderHeight() {
        Assertions.assertEquals(533, Solution.ladderHeight(500, 70));
    }
}