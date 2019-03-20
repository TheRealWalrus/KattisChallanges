package a_new_alphabet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void newAlphabet() {
        assertEquals("@11 `/0|_||Z 8@$3 @|Z3 8310[]\\[]6 ']['0 |_|$.", Solution.newAlphabet("All your base are belong to us."));
        assertEquals("\\/\\/[-]@'][''$ ']['[-]3 #|Z3(,)|_|3[]\\[](`/, |<3[]\\[][]\\[]3']['[-]?", Solution.newAlphabet("What's the Frequency, Kenneth?"));
        assertEquals("@ []\\[]3\\/\\/ @1|D[-]@83']['!", Solution.newAlphabet("A new alphabet!"));
    }
}