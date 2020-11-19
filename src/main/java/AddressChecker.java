public class AddressChecker {

    public boolean postcodeValidator(String postcode) {
        // Google Regex pattern for valid UK postcodes
        String regexPattern = "(GIR 0AA)|((([A-Z-[QVX]][0-9][0-9]?)|(([A-Z-[QVX]][A-Z-[IJZ]][0-9\u200C\u200B][0-9]?)|(([A-Z-[QVX\u200C\u200B]][0-9][A-HJKSTUW])|\u200C\u200B([A-Z-[QVX]][A-Z-[IJ\u200C\u200BZ]][0-9][ABEHMNPRVWX\u200C\u200BY]))))\\s?[0-9][A-Z-[\u200C\u200BCIKMOV]]{2})";
        // return boolean after attempting to match postcode to the above pattern
        return postcode.matches(regexPattern);
    }

    public boolean streetNumberValidator(String streetNumber) {
        // Regex pattern for numbers
        String regexPattern = "[0-9]+";
        // return boolean after attempting to match street number to the above pattern
        return streetNumber.matches(regexPattern);
    }

    public boolean streetNameValidator(String streetName) {
        // Regex pattern for alpha characters
        String regexPattern = "^[a-zA-Z]+$";
        // return boolean after attempting to match street name to the above pattern
        return streetName.matches(regexPattern);
    }
}
