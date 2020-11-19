import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class TestAddressChecker {

    @Test
    public void testAValidPostcode() {
        AddressChecker positiveValidator = new AddressChecker();
        String goodPostcode = "BT50 2AA";

        assertTrue(positiveValidator.postcodeValidator(goodPostcode));
    }

    @Test
    public void testMultipleInvalidPostcodes() {
        AddressChecker negativeValidator = new AddressChecker();
        String[] badPostcodes = new String[] {"12 123", ""};

        for (String badPostcode : badPostcodes) {
            assertFalse(badPostcode + " is not an invalid postcode!", negativeValidator.postcodeValidator(badPostcode));
        }
    }

    //TODO: Write further unit tests to cover all functionality
}
