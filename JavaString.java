public class JavaString {
    /*
     * String is non-primitive data types and object
     * if String is object it van perform certains operations with their object
     * method
     */
    public static void main(String[] args) {

        // String Length Method
        String txt = "AREYOUTHEREALPROGRAMMER?";
        System.out.println("The Length of the txt String is : " + txt.length());

        // String toUppercase() and toLowerCase() Method
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        // Finding a Character in a string with indexOf()
        String haystack = "Please find 'note' and note it";
        System.out.println(haystack.indexOf("note")); // It will return 13 bcs first 'note' at 13 index

        // String Concatentaion
        String firstName = "John";
        String lastName = "Travolta";
        System.out.println(firstName.concat(" ".concat(lastName)));

        /*
         * If want to print special character like "" , / , etc there is a way to do it
         * by insert \ char before any special characters.
         * addition \ char has other common escape sequences like
         * \n : for adding new line ; \r : gor carriage return etc.
         */

        String specCharSentence = "This is special like \"You In My Heart\" ";
        System.out.println(specCharSentence);

    }

}
