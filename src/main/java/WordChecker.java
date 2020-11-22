public class WordChecker {

    public boolean postcodeValidator(String postcode) {
        // Google Regex pattern for valid UK postcodes
        String regexPattern = "(GIR 0AA)|((([A-Z-[QVX]][0-9][0-9]?)|(([A-Z-[QVX]][A-Z-[IJZ]][0-9\u200C\u200B][0-9]?)|(([A-Z-[QVX\u200C\u200B]][0-9][A-HJKSTUW])|\u200C\u200B([A-Z-[QVX]][A-Z-[IJ\u200C\u200BZ]][0-9][ABEHMNPRVWX\u200C\u200BY]))))\\s?[0-9][A-Z-[\u200C\u200BCIKMOV]]{2})";
        // return boolean after attempting to match postcode to the above pattern
        return postcode.matches(regexPattern);
    }
}
