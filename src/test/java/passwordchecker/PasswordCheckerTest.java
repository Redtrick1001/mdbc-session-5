package passwordchecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void checkBlankPasswordReturnsFalse() {
        PasswordChecker checker = new PasswordChecker();
        assertFalse(checker.checkPassword(""));
    }

    @Test
    void checksShoterPasswordReturnFalse() {
        PasswordChecker checker = new PasswordChecker();
        assertFalse(checker.checkPassword("1aaa"));
    }

    @Test
    void checkEightCharacterPasswordReturnTrue() {
        PasswordChecker checker = new PasswordChecker();
        assertTrue(checker.checkPassword("aaaaaaaa1"));
    }

    @Test
    void checkFalseIfNoNumberPresent() {
        PasswordChecker checker = new PasswordChecker();
        assertFalse(checker.checkPassword("aaaaaaaa"));
    }

    @Test
    void checkFalseIfNoLetterPresent() {
        PasswordChecker checker = new PasswordChecker();
        assertFalse(checker.checkPassword("11111111"));
    }
}