package popular_vote;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void popularVote() {
        int[] case1 = {10, 21, 10};
        int[] case2 = {20, 10, 10};
        int[] case3 = {10, 10, 10};
        int[] case4 = {15, 15, 15, 45};

        assertEquals("majority winner 2", Solution.popularVote(case1));
        assertEquals("minority winner 1", Solution.popularVote(case2));
        assertEquals("no winner", Solution.popularVote(case3));
        assertEquals("minority winner 4", Solution.popularVote(case4));
    }
}