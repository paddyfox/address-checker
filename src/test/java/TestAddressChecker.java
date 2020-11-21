import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TestAddressChecker {

    @Test
    public void testAValidPostcode() {
        AddressChecker positiveValidator = new AddressChecker();
        String goodPostcode = "AA617AA";

        assertTrue(positiveValidator.postcodeValidator(goodPostcode));
    }
}
