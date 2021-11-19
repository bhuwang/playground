/**
 * 
 */

/**
 * @author bhuwangautam
 *
 */
public class AdressUtil {

    public static String constructAddress(String streetNo, String streetName, String city, String stateCode, String zip) {
        String address = "";
        if (streetName == null && (city == null || stateCode == null || zip == null)) {
            address = "Missgin Address Information.";
        } else {
            address = new StringBuilder(streetNo != null ? new StringBuilder(streetNo).append(" ") : "")
                    .append(streetName != null ? new StringBuilder(streetName).append(", ") : "<missing_street_address>, ").append(city)
                    .append(", ").append(stateCode).append(" ").append(zip).toString();
        }
        return address;
    }

    public static void main(String[] args) {
        System.out.println(constructAddress("199", "Wells Ave", "Newton", "MA", "02459"));

        System.out.println(constructAddress(null, "Wells Ave", "Newton", "MA", "02459"));

        System.out.println(constructAddress(null, null, "Newton", "MA", "02459"));

        System.out.println(constructAddress(null, null, null, "MA", "02459"));

    }
}
