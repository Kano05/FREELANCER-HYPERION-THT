import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ISBNValidatorTest {

    @Test
    public void userInputShouldStaySame() {
        Assertions.assertEquals("0987654323456", ISBNValidator.checkForX("0987654323456"));
    }

    @Test
    public void userInputShouldBeValid() {
        Assertions.assertEquals("Valid", ISBNValidator.check13DigitISBN("0987654323456"));
    }

    @Test
    public void userInputShouldReturnNewNumber() {
        Assertions.assertEquals("0987654323456", ISBNValidator.ISBN10Converter("0987654323456"));
    }

    @Test
    public void userInputShouldReturnInvalid() {
        Assertions.assertEquals("Invalid", ISBNValidator.check10DigitISBN("065432345"));
    }
}
