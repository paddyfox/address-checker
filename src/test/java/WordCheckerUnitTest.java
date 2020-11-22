import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class WordCheckerUnitTest {

    @Test
    public void postcodeValidatorValidPostcodeTest() {
        WordChecker positiveValidator = new WordChecker();
        String goodPostcode = "AA617AA";

        assertTrue(positiveValidator.postcodeValidator(goodPostcode));
    }
}
