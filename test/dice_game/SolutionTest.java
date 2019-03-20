package dice_game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void diceGame() {

        int[] gunnar1 = {1, 4, 1, 4};
        int[] emma1 = {1, 6, 1, 6};

        Assertions.assertEquals("Emma", Solution.diceGame(gunnar1, emma1));

        int[] gunnar2 = {1, 8, 1, 8};
        int[] emma2 = {1, 10, 2, 5};

        Assertions.assertEquals("Tie", Solution.diceGame(gunnar2, emma2));

        int[] gunnar3 = {2, 5, 2, 7};
        int[] emma3 = {1, 5, 2, 5};

        Assertions.assertEquals("Gunnar", Solution.diceGame(gunnar3, emma3));
    }
}