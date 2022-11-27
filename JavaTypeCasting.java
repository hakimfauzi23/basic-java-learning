public class JavaTypeCasting {
    /*
     * Type casting is when you assign a value of one primitive data type to another
     * type.
     */
    public static void main(String[] args) {
        /*
         * Widening Casting (automatically) - converting a smaller type to a larger type
         * size
         */
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt); // Output 9
        System.out.println(myDouble); // Output 9.0

        /*
         * Narrowing Casting (manually) - converting a larger type to a smaller size
         * type
         */
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble1;

        System.out.println(myDouble1); // Output 9.78
        System.out.println(myInt1); // Output 9

    }
}
